package com.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
         Employee e=(Employee)a.getBean("employee");
         System.out.println(e.getEmpname()+" "+e.getId()+" "+e.getPlace());
	}

}
