package com.github.qichengjian.guava.cache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.concurrent.TimeUnit;

/**
 * Cache和LoadingCache都是接口，LoadingCache继承自Cache，并而外多了几个接口
 */
public class CacheTest {

    public static void main(String[] args) {
        Cache cache = CacheBuilder.newBuilder()
                //数据在多长时间内没有被访问后失效
                .expireAfterAccess(3, TimeUnit.MINUTES)
                //写入多长时间后失效
                .expireAfterWrite(10, TimeUnit.SECONDS)
                //并发更新操作最大数量
                .concurrencyLevel(5)
                //最大容量
                .maximumSize(10)
                // 初始容量
                .initialCapacity(1024)
                //软引用，将缓存中的数据使用SoftReference声明，数据会被GC来管理，按照LRU的原则
                //来定期GC数据
                .softValues()
                .build();

        cache.put("MVP", "James");

        System.out.println(cache.getIfPresent("MVP"));
    }
}
