package com.example.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Employee;
import com.example.service.EmployeeServiceImpl;

public class Test {
public static void main(String args[])
{
	ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
	EmployeeServiceImpl e= a.getBean("employeeService",EmployeeServiceImpl.class);
	/*Employee e1=new Employee();
	e1.setEmployeeid(134);
	e1.setEmployeename("abc");
	
	e1.setSalary(124);
	e1.setEmail("abc@gmail.com");*/
	//e1.setGender("f");
//e.createEmployee(e1);
Employee e5=e.getEmployee(130);
System.out.println(e5);
System.out.println("displaying");
List<Employee> e6=e.getAllEmployeedetails();
for(Employee e7:e6)
	System.out.println(e7);
e.updateEmployee("aaa@gmail.com",134);
/*e.deleteEmployeeById(134);*/
	
}
}
