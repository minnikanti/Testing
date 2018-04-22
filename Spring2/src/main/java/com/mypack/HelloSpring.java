package com.mypack;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mypack.pojo.Employee;
import com.mypack.service.EmployeeService;

public class HelloSpring {
	//Added in github.com
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-context.xml");
		EmployeeService empService = context.getBean(EmployeeService.class);
		System.out.println(empService);
		
		Employee emp1 = new Employee();
		emp1.setEmpName("Employee1");
		emp1.setDeptNo(101);
		emp1.setSalary(10000);
		
		empService.addEmployee(emp1);
		
		List<Employee> empList = empService.getAllEmployees();
		for(Employee empTemp : empList) {
			System.out.println(empTemp.toString());
		}
		
		System.out.println("=========================");
		
		Employee emp2 = new Employee();
		emp2.setEmpName("Employee2");
		emp2.setDeptNo(102);
		emp2.setSalary(8000);
		
		empService.addEmployee(emp2);
		
		empList = empService.getAllEmployees();
		for(Employee empTemp : empList) {
			System.out.println(empTemp.toString());
		}
		
		System.out.println("=========================");
		
		System.out.println("Getting Employee 1001 details");
		Employee emp = empService.getEmployee(1001);
		System.out.println(emp.toString());
		
		System.out.println("=========================");
		System.out.println("Updating Employee 1002 salary");
		Employee emp3 = empService.getEmployee(1002);
		emp3.setSalary(8500);
		empService.updateEmployee(emp3);
		
		System.out.println(empService.getEmployee(1002));
		
		System.out.println("=========================");
		System.out.println("Deleting Employee 1002");
		empService.deleteEmploee(1002);
		
		System.out.println("=========================");
		empList = empService.getAllEmployees();
		for(Employee empTemp : empList) {
			System.out.println(empTemp);
		}
	}

}
