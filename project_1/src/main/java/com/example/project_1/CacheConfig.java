package com.example.project_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class CacheConfig {

    @Autowired
    CacheManager cacheManager;

    public void evictAllCacheValues(String cacheName) {
        Cache cache = cacheManager.getCache(cacheName);
//        cache.
        cacheManager.getCache(cacheName).clear();
    }

    @Scheduled(fixedRate = 5000)
    public void evictAllcachesAtIntervals() {
        System.out.println("clearing cachees");
        evictAllCacheValues("project2");
    }
}
