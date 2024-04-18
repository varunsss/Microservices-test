package com.varun.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.varun.user.domain.Department;

@RestController
public class UserController {
	/*
	 * @Autowired UserService userService;
	 */
	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${eureka.instance.instance-id}")
	private String instanceId;
	
	@GetMapping("/user/department/{id}")
	public Department getDepartmentById(@PathVariable String id) {
		System.out.println("url :"+"http://department-service/department/"+id);
		System.out.println("instanceId :"+instanceId);
		return restTemplate.getForObject("http://department-service/department/"+id, Department.class);
	
	} // http://localhost:8084/user/department/101
	
	@GetMapping("/user")
	public String getUser() {
		return "User call...";
	
	}
}
