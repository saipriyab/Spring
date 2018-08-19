package com.example1;

public class Employee {
private String ename;
private String email;
private String empid;
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getEmpid() {
	return empid;
}
public void setEmpid(String empid) {
	this.empid = empid;
}
@Override
public String toString() {
	return "Employee [ename=" + ename + ", email=" + email + ", empid=" + empid + "]";
}

}
