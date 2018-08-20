package com.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ApplicationContext a=new ClassPathXmlApplicationContext("beans2.xml");
          Employee e=a.getBean("employee",Employee.class);
          System.out.println(e);
	}

}
