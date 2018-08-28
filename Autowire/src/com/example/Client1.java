package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    ApplicationContext a=new ClassPathXmlApplicationContext("beans2.xml");
	    Employee1 e=a.getBean("employee1",Employee1.class);
	    System.out.println(e.getEmpid()+" "+e.getEmpname()+" "+e.getPancard().getPanno()+" "+e.getPancard().getPanname());
	       
	}

}
