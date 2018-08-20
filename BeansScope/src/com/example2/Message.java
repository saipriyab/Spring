package com.example2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Message {
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
@Override
public String toString() {
	return "Message [messageid=" + messageid + ", message=" + message + "]";
}

}
