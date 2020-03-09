package com.concon.redisapp.controller;

import com.concon.redisapp.service.RedisCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class CacheController {

    private int sayac=0;

    @Autowired
    private RedisCacheService redisCacheService;

    @GetMapping
    public String cacheControl() throws InterruptedException {
        if(sayac==5){
         redisCacheService.clearCache();
         sayac=0;
        }
        sayac++;
        return redisCacheService.longRunningMethod();
    }
}
