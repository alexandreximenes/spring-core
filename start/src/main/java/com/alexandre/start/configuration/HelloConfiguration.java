package com.alexandre.start.configuration;

import com.alexandre.start.services.HelloWorldService;
import com.alexandre.start.services.HelloWorldServiceEnglishImpl;
import com.alexandre.start.services.HelloWorldServiceSpanishImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfiguration {

    @Bean
    @Profile("english")
    @Primary
    public HelloWorldService helloWorldServiceEnglish(){
        return new HelloWorldServiceEnglishImpl();
    }

    @Bean
    @Profile("spanish")
    @Qualifier
    public HelloWorldService helloWorldServiceSpanish(){
        return new HelloWorldServiceSpanishImpl();
    }
}
