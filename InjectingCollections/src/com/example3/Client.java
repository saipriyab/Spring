package com.example3;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String args[])
{
	ApplicationContext a=new ClassPathXmlApplicationContext("beans2.xml");
	Info i=a.getBean("info",Info.class);
	Student s[]=i.getS();
	System.out.println("Array values are");
	for(Student s2:s)
	{
		System.out.println(s2.getStudentid()+" "+s2.getStudentname()+" "+s2.getEmail()+" "+s2.getGender());
	}
	System.out.println("List values are");
	List<Student> sl=i.getStuList();
	for(Student s2:sl)
	{
		System.out.println(s2.getStudentid()+" "+s2.getStudentname()+" "+s2.getEmail()+" "+s2.getGender());
	}
	System.out.println("Set values are");
	List<Student> se=i.getStuList();
	for(Student s2:se)
	{
		System.out.println(s2.getStudentid()+" "+s2.getStudentname()+" "+s2.getEmail()+" "+s2.getGender());
	}
}
}
