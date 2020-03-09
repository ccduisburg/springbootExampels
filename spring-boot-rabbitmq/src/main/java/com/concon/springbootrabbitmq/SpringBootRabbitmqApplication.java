package com.concon.springbootrabbitmq;

import com.concon.springbootrabbitmq.model.Notification;
import com.concon.springbootrabbitmq.producer.NotificationProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class SpringBootRabbitmqApplication {
     public static void main(String[] args) {
        SpringApplication.run(SpringBootRabbitmqApplication.class, args);

    }

}
