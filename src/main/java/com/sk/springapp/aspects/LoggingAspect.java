package com.sk.springapp.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Sergey Kuzhel
 */
@Aspect
@Component
public class LoggingAspect {

    @Autowired
    public LoggingAspect() {
    }

    @Before("execution(* com.sk.springapp.service.impl.QuestionServiceImpl.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("method ask a questions and get answers: " + joinPoint.getSignature());
    }

    @Around("execution(* com.sk.springapp.service.impl.PersonServiceImpl.*(..))")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("method get person by name : " + joinPoint.getSignature());
       // System.out.println("method  has an arguments: " + Arrays.toString(joinPoint.getArgs()));

        System.out.println("before running");
        Object obj = joinPoint.proceed();
        System.out.println("after running");

        return obj;
    }
}
