package com.concon.aop.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public String getMessage(String param){
        System.out.println("Method gave Message param :"+param);
        return param;
    }
}
