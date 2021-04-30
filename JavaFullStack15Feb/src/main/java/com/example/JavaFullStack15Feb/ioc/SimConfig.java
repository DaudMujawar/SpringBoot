package com.example.JavaFullStack15Feb.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimConfig {
    @Bean
    public Airtel getAirtel(){
        return new Airtel();
    }

    @Bean
    public Jio getJio(){
        return new Jio();
    }
}

