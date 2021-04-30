package com.example.JavaFullStack15Feb.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Mobile {

//    Inversion of control: Instead of we creating object (using 'new' keyword) Spring will create
//    @Bean: In Spring, Java object called spring bean or bean
//    Configuration: Indicates that a class declares one or more @Bean methods
public static void main(String[] args) {

//    Airtel airtel=new Airtel();
//    airtel.calling();
//    airtel.data();
//    System.out.println();
//
//    Jio jio=new Jio();
//    jio.calling();
//    jio.data();
//    System.out.println();

//    Sim sim=new Airtel();
//    sim.calling();
//    sim.data();


    ApplicationContext context = new AnnotationConfigApplicationContext(SimConfig.class);
    Airtel air=context.getBean(Airtel.class);
    Jio jio=context.getBean(Jio.class);

    air.calling();
    air.data();
}
}
