package com.example1;

import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
         Example1 e=a.getBean("example1",Example1.class);
         String p[]=e.getNames();
         System.out.println("Array Values");
         for(String p1:p)
        	 System.out.println(p1);
         System.out.println("List values");
         List<String> l=e.getEmpnameList();
         for(String p3:l)
        	 System.out.println(p3);
         System.out.println("Set values");
         Set<Integer> i=e.getEmpIdset();
         for(Integer j:i)
        	 System.out.println(j);
         
	}

}
