package com.concon.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {//burda sdsdece bir methodu dinliyor ve araya giriyotuz
    @Before("execution(* com.concon.aop.service.MessageService.getMessage(..))")
    public void beforegetMessage(JoinPoint joinPoint) {
        System.out.println("Wir haben eine parametre gehapt before getMessage methode" + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }

    @After("execution(* com.concon.aop.service.*.*(..))")
    public void aftergetMessage(JoinPoint joinPoint) {
        System.out.println("Wir haben eine parametre gehapt nach getMessage methode" + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }
}
