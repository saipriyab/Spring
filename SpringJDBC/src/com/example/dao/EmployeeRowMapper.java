package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.setEmployeeid(rs.getInt("employeeid"));
		e1.setEmployeename(rs.getString("employeename"));
		e1.setSalary(rs.getDouble("salary"));
		e1.setEmail(rs.getString("email"));
		System.out.println(e1);
		return e1;
	}



}
