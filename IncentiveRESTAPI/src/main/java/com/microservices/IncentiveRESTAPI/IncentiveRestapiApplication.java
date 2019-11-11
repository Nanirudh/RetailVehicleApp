package com.microservices.IncentiveRESTAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class IncentiveRestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(IncentiveRestapiApplication.class, args);
	}

}
