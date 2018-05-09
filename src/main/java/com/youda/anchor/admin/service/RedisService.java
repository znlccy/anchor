package com.youda.anchor.admin.service;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/9-13:36
 * @Version: v1.0.0
 * @Comment: Redis工具类
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("unchecked")
@Service
public class RedisService {

    @SuppressWarnings("rawtypes")
    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 批量删除对用的value
     * @param: [keys]
     * @return: void
     */
    public void remove(final String... keys) {
        for (String key: keys) {
            remove(key);
        }
    }

    /**
     * 批量删除key
     * @param: [pattern]
     * @return: void
     */
    public void removePattern(final String pattern) {
        Set<Serializable> keys = redisTemplate.keys(pattern);
        if (keys.size() > 0) {
            redisTemplate.delete(keys);
        }
    }

    /**
     * 删除对应的value
     * @param: [key]
     * @return: void
     */
    public void remove(final String key) {
        if (exists(key)) {
            redisTemplate.delete(key);
        }
    }

    /**
     * 判断缓存中是否有对应的value
     * @param: [key]
     * @return: boolean
     */
    public boolean exists(final String key) {
        return redisTemplate.hasKey(key);
    }

    /**
     * 读取缓存
     * @param: [key]
     * @return: java.lang.String
     */
    public String get(final String key) {
        String result = null;
        try {
            redisTemplate.setValueSerializer(new StringRedisSerializer());
            ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
            result = operations.get(key).toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result == null) {
            return null;
        }
        return result;
    }

    /**
     * 写入缓存
     * @param: [key, value]
     * @return: boolean
     */
    public boolean set(final String key, Object value) {
        boolean result = false;
        try {
            ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
            operations.set(key, value);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 写入缓存带有过期时间
     * @param: [key, value, expireTime]
     * @return: boolean
     */
    public boolean set(final String key, Object value, Long expireTime) {
        boolean result = false;
        try {
            ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
            operations.set(key, value);
            redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 写入哈希
     * @param: [key, value]
     * @return: boolean
     */
    public boolean hmSet(String key, Map<String, String> value) {
        boolean result = false;
        try {
            redisTemplate.opsForHash().putAll(key, value);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    /**
     * 读取散列表
     * @param: [key]
     * @return: java.util.Map<java.lang.String,java.lang.String>
     */
    public Map<String, String> hmGet(String key) {
        Map<String, String> result = null;
        try {
            result = redisTemplate.opsForHash().entries(key);
            if (result == null) {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 写入列表
     * @param: [key, value]
     * @return: void
     */
    public boolean lPush(String key, Object value) {
        boolean result = false;
        try {
            ListOperations<String, Object> list = redisTemplate.opsForList();
            list.rightPush(key, value);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 获取列表
     * @param: [key, start, end]
     * @return: java.util.List<java.lang.Object>
     */
    public List<Object> lRange(String key, long start, long end) {
        List<Object> result = null;
        try {
            ListOperations<String, Object> list = redisTemplate.opsForList();
            result = list.range(key, start, end);
            if (result == null) {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 写入集合
     * @param: [key, value]
     * @return: boolean
     */
    public boolean add(String key, Object value) {
        boolean result = false;
        try {
            SetOperations<String, Object> set = redisTemplate.opsForSet();
            set.add(key, value);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 获取集合
     * @param: [key]
     * @return: java.util.Set<java.lang.Object>
     */
    public Set<Object> setMembers(String key) {
        Set<Object> result = null;
        try {
            SetOperations<String, Object> set = redisTemplate.opsForSet();
            result = set.members(key);
            if (result == null) {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 写入有序集合
     * @param: [key, value, source]
     * @return: boolean
     */
    public boolean zAdd(String key, Object value, double scoure) {
        boolean result = false;
        try {
            ZSetOperations<String, Object> zSet = redisTemplate.opsForZSet();
            zSet.add(key, value, scoure);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 获取有序集合
     * @param: []
     * @return: java.util.Set<java.lang.Object>
     */
    public Set<Object> rangeByScore(String key, double scoreStart, double scoreEnd) {
        Set<Object> result = null;
        try {
            ZSetOperations<String, Object> zSet = redisTemplate.opsForZSet();
            result = zSet.rangeByScore(key, scoreStart, scoreEnd);
            if (result == null) {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
