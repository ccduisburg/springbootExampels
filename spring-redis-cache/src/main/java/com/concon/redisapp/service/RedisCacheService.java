package com.concon.redisapp.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class RedisCacheService {
    @Cacheable(cacheNames = "myCache")
    public String longRunningMethod() throws InterruptedException {
        Thread.sleep(5000L);
        return "method is running";
    }
    @CacheEvict(cacheNames = "myCache")
    public void clearCache(){
        System.out.println("cache was cleared");
    }
}
