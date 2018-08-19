package com.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTestExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             ApplicationContext a=new ClassPathXmlApplicationContext("beans2.xml");
             Message m=a.getBean("message",Message.class);
             System.out.println(m.getMessage()+" "+m.getMessageid());
             System.out.println(m.getClass().getName());
             System.out.println(a.containsBean("message"));
             System.out.println(a.isPrototype("message"));
             System.out.println(a.isSingleton("message"));
             String p1[]=a.getAliases("message");
             for(String p2:p1)
            	 System.out.println(p2);
             ((AbstractApplicationContext)a).close();	
	}

}
