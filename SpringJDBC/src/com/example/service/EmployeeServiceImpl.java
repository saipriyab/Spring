package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dao.EmployeeDAO;
import com.example.model.Employee;


public class EmployeeServiceImpl implements EmployeeService {
 

	private EmployeeDAO employeeDAO;
	
	
	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Override
	public void createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDAO.createEmployee(employee);
	}

	@Override
	public Employee getEmployee(int empid) {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployee(empid);
	}

	@Override
	public void deleteEmployeeById(int empid) {
		// TODO Auto-generated method stub
		employeeDAO.deleteEmployeeById(empid);

	}

	@Override
	public void updateEmployee(String mailid, int employeeid) {
		// TODO Auto-generated method stub
		employeeDAO.updateEmployee(mailid, employeeid);

	}

	@Override
	public List<Employee> getAllEmployeedetails() {
		// TODO Auto-generated method stub
		return employeeDAO.getAllEmployeedetails();
	}

}
