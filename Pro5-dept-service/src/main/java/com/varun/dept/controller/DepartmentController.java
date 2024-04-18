package com.varun.dept.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.varun.dept.domain.Department;
import com.varun.dept.service.DepartmentService;

@RestController
//@RequestMapping("/api/v1/")
public class DepartmentController {
	
	List<Department> list=Arrays.asList(new Department("101", "HR"),new Department("102", "SALES"));
	@Autowired
	DepartmentService departmentService;
	
	@RequestMapping("/dept/{deptId}")
	public Department getDepartmentDetails(@PathVariable String deptId) {
		return departmentService.getDepartmentByDeptId(deptId);
		
	}
	
	@GetMapping("/department/{id}")
	public Department findDepartmentByDeptId(@PathVariable String id) {
		return list.stream().filter(list->id.equals(list.getDeptid()))
				.findAny()
				.orElse(null);
		
	}
	
	@GetMapping("/department")
	public String departmentDetails() {
		return "Department call";
		
	}

}
