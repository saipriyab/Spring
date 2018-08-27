package com.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ApplicationContext a=new ClassPathXmlApplicationContext("beans1.xml");
          Info s1=a.getBean("info",Info.class);
          Student s4[]=s1.getS();
          for(Student s2:s4)
          {
        	  System.out.println(s2.getStudentid()+" "+s2.getStudentname()+" "+s2.getEmail()+" "+s2.getGender());
          }
          ((AbstractApplicationContext)a).close();
	}

}
