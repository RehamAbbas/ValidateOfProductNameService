package com.example.ValidateService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ValidateServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValidateServiceApplication.class, args);
	}

}
