package com.alexandre.start.services;

import org.springframework.stereotype.Component;

@Component
//@Profile("spanish")
public class HelloWorldServiceSpanishImpl implements HelloWorldService {

    @Override
    public String getGreeting() {
        return "Hola mundo";
    }
}
