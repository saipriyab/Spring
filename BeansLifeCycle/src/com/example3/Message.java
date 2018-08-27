package com.example3;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Message  {
private int messageid;
private String message;
public int getMessageid() {
	return messageid;
}
public void setMessageid(int messageid) {
	this.messageid = messageid;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("destroy method");
	
}

public void init() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("after initializing the properties");
}

}
