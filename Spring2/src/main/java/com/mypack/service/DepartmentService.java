package com.mypack.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.mypack.pojo.Department;

@Component
public class DepartmentService {
	
	private static Map<Integer, Department> deptMap = new HashMap<Integer, Department>();
	
	static {
		Department dept1 = new Department();
		dept1.setDeptId(101);
		dept1.setDeptName("ABC");
		
		Department dept2 = new Department();
		dept2.setDeptId(102);
		dept2.setDeptName("XYZ");
		
		deptMap.put(101, dept1);
		deptMap.put(102, dept2);
	}
		
	public Department getDepartmentName(int deptNo) {
		return deptMap.get(deptNo);
	}

}
