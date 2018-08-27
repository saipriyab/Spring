package com.example4;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext a=new ClassPathXmlApplicationContext("beans3.xml");
        Info i=a.getBean("info",Info.class);
        Map<Integer,String> p=i.getEmap();
        Set<Entry<Integer,String>> k=p.entrySet();
        for(Entry<Integer,String> k2:k)
        {
        	System.out.println(k2.getKey()+" "+k2.getValue());
        }
        System.out.println("key value pair for student");
        Map<Integer,Student> p2=i.getSmap();
        Set<Entry<Integer,Student>> k2=p2.entrySet();
        for(Entry<Integer,Student> k3:k2)
        {
        	System.out.print(k3.getKey());
        	Student s4=k3.getValue();
        	System.out.print(s4.getStudentid()+" "+s4.getStudentname()+" "+s4.getEmail()+" "+s4.getGender());
        	System.out.println();
        }
        
	}

}
