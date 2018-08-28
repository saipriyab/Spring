package com.example1.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
          Student s=a.getBean("student",Student.class);
          System.out.println(s.getStudentid()+" "+s.getStudentname()+" "+s.getCourse().getCourseid()+" "+s.getCourse().getCoursename());
          ((AbstractApplicationContext)a).close();
	}

}
