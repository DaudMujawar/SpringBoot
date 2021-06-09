package com.example.JavaFullStack15Feb.aop;

import org.springframework.stereotype.Component;

@Component
public class BoyStudent {
//    public void studyBoys(){
//        System.out.println("Boy study...");
//    }

    public void studyBoys(int a, int b) {
        throw new ArithmeticException("Arithmetic ex threw");
    }

    public void studyA(){
        System.out.println("Boy A study...");
    }
}
