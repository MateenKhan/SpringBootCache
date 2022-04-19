package com.example.project_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@CacheConfig()
public class Controller {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    @Cacheable("project2")
    public String invokeProject2(){
        String result = restTemplate.getForObject("http://localhost:9090/",String.class);
        return result;
    }


}
