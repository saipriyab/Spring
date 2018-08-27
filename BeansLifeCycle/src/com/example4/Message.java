package com.example4;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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

@PostConstruct
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("destroy method");
	
}
@PreDestroy
public void init() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("after initializing the properties");
}

}
