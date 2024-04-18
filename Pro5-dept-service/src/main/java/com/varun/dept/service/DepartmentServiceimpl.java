package com.varun.dept.service;

import org.springframework.stereotype.Service;

import com.varun.dept.domain.Department;

@Service
public class DepartmentServiceimpl implements DepartmentService{

	@Override
	public Department getDepartmentByDeptId(String deptId) {
		// TODO Auto-generated method stub
		return new Department("1001", "IT Department");
	}

	 

}
