package com.example.JavaFullStack15Feb.ioc;

public class Jio implements Sim{
    @Override
    public void data() {
        System.out.println("Browsing from Jio");
    }

    @Override
    public void calling() {
        System.out.println("Calling from Jio");
    }
}
