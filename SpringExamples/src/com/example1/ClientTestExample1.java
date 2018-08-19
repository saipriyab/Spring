package com.example1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientTestExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Resource r=new ClassPathResource("beans.xml");
            BeanFactory a=new XmlBeanFactory(r);
            Employee e=(Employee) a.getBean("employee");
            System.out.println(e.getEmpid()+" "+e.getEname()+" "+e.getEmail());
            Employee e1=a.getBean("employee",Employee.class);
            System.out.println(e.getEmpid()+" "+e.getEname()+" "+e.getEmail());
            System.out.println(a.containsBean("employee"));
            System.out.println(a.isPrototype("employee"));
            System.out.println(a.isSingleton("employee"));
            String aa[]=a.getAliases("employee");
            for(String p:aa)
            {
            	System.out.println(p);
            }
            System.out.println(a.getClass().getName());
          
	}

}
