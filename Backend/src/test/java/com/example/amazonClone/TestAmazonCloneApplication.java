package com.example.amazonClone;

import org.springframework.boot.SpringApplication;

public class TestAmazonCloneApplication {

	public static void main(String[] args) {
		SpringApplication.from(AmazonCloneApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
