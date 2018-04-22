package com.mypack.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mypack.pojo.Department;
import com.mypack.pojo.Employee;

//@Component
public class EmployeeService {
	
	//@Autowired
	private DepartmentService departmentService;
	
	public DepartmentService getDepartmentService() {
		return departmentService;
	}

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	private int empId = 1001;
	private final Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();
	
	public Employee addEmployee(final Employee emp) {
		emp.setEmpId(empId);
		empMap.put(empId, emp);
		System.out.println("Employee Added..");
		empId++;
		return emp;
	}
	
	public Employee updateEmployee(final Employee emp) {
		empMap.get(emp.getEmpId());
		empMap.put(emp.getEmpId(), emp);
		System.out.println("Employee Updated...");
		return emp;
	}
	
	public void deleteEmploee(int empId) {
		empMap.remove(empId);
	}
	
	public Employee getEmployee(int empId) {
		Employee emp = empMap.get(empId);
		
		Department dept = departmentService.getDepartmentName(emp.getDeptNo());
		
		emp.setDept(dept);
		return emp;
	}
	
	public List<Employee> getAllEmployees() {
		List<Employee> empList = new ArrayList<Employee>();
		for(Entry<Integer, Employee> empEntry : empMap.entrySet()) {
			empList.add(empEntry.getValue());
		}
		return empList;
	}

}
