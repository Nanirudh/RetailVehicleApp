package com.microservices.Leadservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LeadserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeadserviceApplication.class, args);
	}

}
