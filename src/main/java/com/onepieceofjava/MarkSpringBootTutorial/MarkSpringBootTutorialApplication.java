package com.onepieceofjava.MarkSpringBootTutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.onepieceofjava.MarkSpringBootTutorial.controller")
public class MarkSpringBootTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarkSpringBootTutorialApplication.class, args);
	}

}
