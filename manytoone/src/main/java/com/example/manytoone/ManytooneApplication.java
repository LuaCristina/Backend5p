package com.example.manytoone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ManytooneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManytooneApplication.class, args);
	}

}
