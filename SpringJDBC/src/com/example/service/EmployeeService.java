package com.example.service;

import java.util.List;

import com.example.model.Employee;

public interface EmployeeService {
	void createEmployee(Employee employee);
	Employee getEmployee(int empid);
	void deleteEmployeeById(int empid);
	void updateEmployee(String mailid,int employeeid);
	List<Employee> getAllEmployeedetails();
}
