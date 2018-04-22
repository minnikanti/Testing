package com.mypack.pojo;

public class Employee {

	private int empId;
	private String empName;
	private int deptNo;
	private Department dept;

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	private int salary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empId=");
		builder.append(empId);
		builder.append(", empName=");
		builder.append(empName);
		builder.append(", deptNo=");
		builder.append(deptNo);
		builder.append(", dept=");
		builder.append(dept);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}	

}
