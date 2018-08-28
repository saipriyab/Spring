package com.example;

public class Employee2 {
	private int empid;
	private String empname;
	private Pancard2 pancard;
	public Employee2(int empid, String empname, Pancard2 pancard) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.pancard = pancard;
	}
	@Override
	public String toString() {
		return "Employee2 [empid=" + empid + ", empname=" + empname + "]";
	}
	
}
