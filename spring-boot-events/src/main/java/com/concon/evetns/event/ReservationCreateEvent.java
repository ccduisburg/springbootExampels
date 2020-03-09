package com.concon.evetns.event;


import org.springframework.context.ApplicationEvent;

public class ReservationCreateEvent extends ApplicationEvent {


    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public ReservationCreateEvent(Object source) {
        super(source);
    }
}
