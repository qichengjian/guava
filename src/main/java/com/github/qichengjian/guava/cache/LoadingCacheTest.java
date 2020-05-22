package com.github.qichengjian.guava.cache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.Callable;

/**
 * 通过loadingCache使用缓存
 * 使用CacheLoader定义
 */
public class LoadingCacheTest {

    public static void main(String[] args) throws Exception{
        LoadingCacheTest test = new LoadingCacheTest();
        //test.cacheLoader();
        test.callable();
    }

    public void cacheLoader() throws Exception{
        LoadingCache<String, String> loadingCache = CacheBuilder.newBuilder()
                .build(new CacheLoader<String, String>() {
                    @Override
                    public String load(String key) throws Exception {
                        String value = "hello " + key;
                        return value;
                    }
                });
        System.out.println(loadingCache.apply("James"));
        System.out.println(loadingCache.get("James"));
        loadingCache.put("Paul", "MVP");
        System.out.println(loadingCache.get("Paul"));
    }

    public void callable() throws Exception{
        Cache<String, String> cache = CacheBuilder.newBuilder().build();
        final String key = "James";
        String value = cache.get(key, new Callable() {
            public Object call() throws Exception {
                String value = "hello " + key;
                return value;
            }
        });
        System.out.println(value);
        final String mvp = "Paul";
        String valueMvp = cache.get(mvp, new Callable<String>() {
            public String call() throws Exception {
                return "Mvp "+mvp;
            }
        });
        System.out.println(valueMvp);

    }
}

