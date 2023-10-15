package com.payilagam.myprojectweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyprojectwebApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext Context =SpringApplication.run(MyprojectwebApplication.class, args);
		Home h = Context.getBean(Home.class);
		h.connect();
		Home h2 = Context.getBean(Home.class);
		h2.connect();
	}

}
