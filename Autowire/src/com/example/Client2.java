package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext a=new ClassPathXmlApplicationContext("beans3.xml");
		    Employee2 e=a.getBean("employee2",Employee2.class);
		   System.out.println(e);
	}

}
