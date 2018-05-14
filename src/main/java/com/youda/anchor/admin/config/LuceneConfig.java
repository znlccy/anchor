package com.youda.anchor.admin.config;

import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.domain.JpaSort;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/14-15:08
 * @Version: v1.0.0
 * @Comment: Lucene全文索引配置
 */
@Configuration
public class LuceneConfig {

    /**
     * 声明索引目录
     */
    private Directory directory;

    /**
     * 声明索引读取
     */
    private IndexReader indexReader;

    /**
     * 声明索引搜索
     */
    private IndexSearcher indexSearcher;

    /**
     * 启动lucene
     * @param: []
     * @return: void
     */
    @Before(value = "")
    public void setup() throws Exception {

        //索引存放位置，设置在当前目录中
        directory = FSDirectory.open(Paths.get("index/"));

        //创建索引的读取器
        indexReader = DirectoryReader.open(directory);
    }
}
