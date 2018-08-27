package com.example5;

import java.util.Properties;
import java.util.Set;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example4.Info;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext a=new ClassPathXmlApplicationContext("beans4.xml");
	        UserInfo i=a.getBean("info1",UserInfo.class);
	       Properties p=i.getUserinfo();
	       Set<Entry<Object, Object>> k=p.entrySet();
	        for(Entry<Object, Object> k2:k)
	        {
	        	System.out.println(k2.getKey()+" "+k2.getValue());
	        }
	}

}
