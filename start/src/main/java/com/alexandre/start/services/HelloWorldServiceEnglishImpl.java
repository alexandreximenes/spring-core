package com.alexandre.start.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@Profile({"default","english"})
//@Primary
public class HelloWorldServiceEnglishImpl implements HelloWorldService{

    @Override
    public String getGreeting() {
        return "Hello World";
    }
}
