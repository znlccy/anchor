package com.youda.anchor.admin.request;
/**
 * @Author: Administrator
 * @Datetime: 2018/4/26-13:42
 * @Version: v1.0.0
 * @Comment: 管理员请求
 */
public class AdminRequest {

    /**
     * 声明用户名
     */
    private String username;

    /**
     * 声明密码
     */
    private String password;

    /**
     * 实现获得用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 实现设置用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @param: [] 实现获得密码
     * @return: java.lang.String
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param: [password] 实现设置密码
     * @return: void
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
