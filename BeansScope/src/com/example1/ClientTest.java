package com.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {
public static void main(String args[])
{
	ApplicationContext a=new ClassPathXmlApplicationContext("beans1.xml");
	Message m1=a.getBean("message",Message.class);
	Message m2=a.getBean("message",Message.class);
	System.out.println(m1==m2);
	System.out.println(m1.getMessageid()+" "+m1.getMessage());
}
}
