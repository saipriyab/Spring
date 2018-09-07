package com.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.model.Employee;


public class EmployeeDAOImpl implements EmployeeDAO {
	

	private JdbcTemplate jdbctemplate;

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	@Override
	public void createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("entered");
		
		
		String sql="insert into employee30(employeeid,employeename,email,salary) values(?,?,?,?)";
		int update=jdbctemplate.update(sql,new Object[] {employee.getEmployeeid(),employee.getEmployeename(),employee.getEmail(),employee.getSalary()});
             if(update>0)
            	 System.out.println("insertde");
	}

	@Override
	public Employee getEmployee(int employeeid) {
		System.out.println("entered ");
		String sql="select * from employee30 where employeeid=?";
	//	Employee e2=jdbctemplate.queryForObject(sql, new EmployeeRowMapper(),employeeid);

		//System.out.println(e2.getEmail());
		Employee e6=(Employee)jdbctemplate.queryForObject(sql,new EmployeeRowMapper(),employeeid);
		System.out.println(e6);
		return e6;
	}

	@Override
	public void deleteEmployeeById(int empid) {
		// TODO Auto-generated method stub
		String sql="delete from employee30 where employeeid=?";
		int update=jdbctemplate.update(sql,empid);
		if(update>0)
			System.out.println("deleted");

	}

	@Override
	public void updateEmployee(String mailid, int employeeid) {
		// TODO Auto-generated method stub
		String sql="update employee30 set email=? where employeeid=?";
		int update=jdbctemplate.update(sql,mailid,employeeid);
		if(update>0)
			System.out.println("updated");

	}

	@Override
	public List<Employee> getAllEmployeedetails() {
		String sql="select * from employee30";
		List<Employee>  e=jdbctemplate.query(sql,new EmployeeRowMapper());
		return e;
	}

}
