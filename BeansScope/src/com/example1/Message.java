package com.example1;

public class Message {
private String message;
int messageid;
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public int getMessageid() {
	return messageid;
}
public void setMessageid(int messageid) {
	this.messageid = messageid;
}
@Override
public String toString() {
	return "Message [message=" + message + ", messageid=" + messageid + "]";
}

}
