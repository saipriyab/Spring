package com.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClienTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext a=new ClassPathXmlApplicationContext("beans1.xml");
       Employee e=a.getBean("employee",Employee.class);
       System.out.println(e);
	}

}
