package com.concon.springbootrabbitmq.listener;

import com.concon.springbootrabbitmq.model.Notification;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {
    @RabbitListener(queues = "concon-queue")
  public void  handleMessage(Notification notification){
        System.out.println("Mesaj alindi ");
      System.out.println(notification.toString());
    }
}
