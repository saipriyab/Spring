package com.example3;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ClientTestExample3 {
public static void main(String args[])
{
	ApplicationContext  a=null;
	try
	{
/*	a=new FileSystemXmlApplicationContext("C:\\Users\\saipriyadarshini\\springexamples\\SpringExamples\\src\\beans3.xml");*/
		/*a=new FileSystemXmlApplicationContext("C:/Users/saipriyadarshini/springexamples/SpringExamples/src/beans3.xml");*/
		a=new FileSystemXmlApplicationContext("src/beans3.xml");
	Student s1=a.getBean("student",Student.class);
	System.out.println(s1.getStudentid()+" "+s1.getStudentname()+" "+s1.getStudentmailid());
	
	}
	catch(BeansException e)
	{
		e.printStackTrace();
	}
	finally
	{
		((AbstractApplicationContext)a).close();
	}
}
}
