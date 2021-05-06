package com.example.JavaFullStack15Feb.di;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Component => create object when spring application run
@Component
//@Scope(value = "singleton")
public class Student {
    int id;
    String name;
    String address;

    public Student() {
        System.out.println("Object created");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void show() {
        System.out.println("In show");
    }
}
