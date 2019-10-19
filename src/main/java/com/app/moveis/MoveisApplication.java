package com.app.moveis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.app.moveis.controller"})
public class MoveisApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoveisApplication.class, args);
	}

}
