package com.varun.discovery.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Pro3DiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Pro3DiscoveryServiceApplication.class, args);
	}

}
