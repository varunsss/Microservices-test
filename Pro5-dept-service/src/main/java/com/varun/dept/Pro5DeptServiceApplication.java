package com.varun.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Pro5DeptServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Pro5DeptServiceApplication.class, args);
	}

}
