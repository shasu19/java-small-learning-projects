package com.shasu19p.model;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = 9110334374060694947L;

	private int empId;
	private String name;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}
}