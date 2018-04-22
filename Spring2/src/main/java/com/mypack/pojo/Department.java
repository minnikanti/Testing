package com.mypack.pojo;

public class Department {

	private int deptId;
	private String deptName;

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Department [deptId=");
		builder.append(deptId);
		builder.append(", deptName=");
		builder.append(deptName);
		builder.append("]");
		return builder.toString();
	}

}
