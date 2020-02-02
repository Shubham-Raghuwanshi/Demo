package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication //it indicates that this is the main class of springboot application 
public class FirstSpringProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext contex=SpringApplication.run(FirstSpringProjectApplication.class, args);
		Alian a= contex.getBean(Alian.class);// loose coupling- in spring container it will creat the obj
		a.show();
	}

}

