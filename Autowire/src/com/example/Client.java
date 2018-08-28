package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
	    Employee e=a.getBean("employee",Employee.class);
	    System.out.println(e.getEmpid()+" "+e.getEmpname()+" "+e.getPancard().getPanno()+" "+e.getPancard().getPanname());
	       
	}

}
