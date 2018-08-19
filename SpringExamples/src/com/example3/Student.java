package com.example3;

public class Student {
private int studentid;
private String studentname;
private String studentmailid;
public int getStudentid() {
	return studentid;
}
public void setStudentid(int studentid) {
	this.studentid = studentid;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public String getStudentmailid() {
	return studentmailid;
}
public void setStudentmailid(String studentmailid) {
	this.studentmailid = studentmailid;
}
@Override
public String toString() {
	return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentmailid=" + studentmailid
			+ "]";
}

}
