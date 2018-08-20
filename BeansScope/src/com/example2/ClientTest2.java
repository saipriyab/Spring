package com.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           ApplicationContext a=new ClassPathXmlApplicationContext("beans2.xml");
           Message m=a.getBean("message",Message.class);
           m.setMessage("hello");
           m.setMessageid(12345);
           System.out.println(m.getMessageid()+" "+m.getMessage());
	}

}
