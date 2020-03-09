package com.concon.evetns.event.listener.ReservationEventListener;

import com.concon.evetns.event.ReservationCreateEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ReservationEventListener {
    @EventListener//extradan configre edilmesi gerekiyor
    public void reservationEventHandler(ReservationCreateEvent reservationCreateEvent) throws InterruptedException {
        Thread.sleep(5000L);//Request geldikten 5 sn sonra
        System.out.println("EventListener-> " + reservationCreateEvent.getSource().toString());
    }
}
