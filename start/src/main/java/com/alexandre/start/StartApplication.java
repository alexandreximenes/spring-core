package com.alexandre.start;

import com.alexandre.start.controllers.GreetingController;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StartApplication {

	public static void main(String[] args) {
		org.springframework.context.ApplicationContext ctx = SpringApplication.run(StartApplication.class, args);
		GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");

		greetingController.sayHello();
	}
}
