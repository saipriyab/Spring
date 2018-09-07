package com.example.model;

public class Employee {
private int employeeid;
private String employeename;
private String email;
private double salary;
//private String gender;
public int getEmployeeid() {
	return employeeid;
}
public void setEmployeeid(int employeeid) {
	this.employeeid = employeeid;
}
public String getEmployeename() {
	return employeename;
}
public void setEmployeename(String employeename) {
	this.employeename = employeename;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", email=" + email + ", salary="
			+ salary + "]";
}


}
