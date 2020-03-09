package com.concon.evetns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync//Asyn calismayi aktif hale getirmek icin burada enable yapmak zorundayiz
public class EventApplication {
    public static void main(String[] args) {
        SpringApplication.run(EventApplication.class,args);
    }
}
