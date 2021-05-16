package com.example.JavaFullStack15Feb;

import com.example.JavaFullStack15Feb.di.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class JavaFullStack15FebApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(JavaFullStack15FebApplication.class, args);
//
//        com.example.JavaFullStack15Feb.di.Student s = context.getBean(Student.class);
//        s.show();
//
//        com.example.JavaFullStack15Feb.di.Student s1 = context.getBean(Student.class);
//        s1.show();
//
//        com.example.JavaFullStack15Feb.di.Student s2 = context.getBean(Student.class);
//        s2.show();

    }

}
