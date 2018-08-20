package com.example1;

public class Employee {
private int empid;
private String empname;
private Address address;
public Employee(int empid, String empname, Address address) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.address = address;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", empname=" + empname + ", address=" + address + "]";
}


}
