package com.varun.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableDiscoveryClient  //or  EnableEurekaClient
public class Pro4UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Pro4UserServiceApplication.class, args);
	}

	@LoadBalanced
	@Bean(name="restTemplate")
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
