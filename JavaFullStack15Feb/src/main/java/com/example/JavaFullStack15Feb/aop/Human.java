package com.example.JavaFullStack15Feb.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {
//    @Before(value = "execution(public void study())")
//    public void wakeUp(){
//        System.out.println("Wake up...");
//    }

//    @After("execution(public * study*(..))")
//    public void sleep(){
//        System.out.println("Sleep...");
//    }

//    @Pointcut("execution(public * study*(..))")
//    public void myPointCut(){}

//    @AfterReturning(pointcut = "execution(public * study*(..))",returning = "value")
//    public void wakeUp(int value){
//        System.out.println("Wake up "+value);
//    }

    @AfterThrowing(pointcut = "execution(public * study*(..))",throwing = "value")
    public void wakeUp(ArithmeticException value){
        System.out.println("Wake up "+value);
    }


}
