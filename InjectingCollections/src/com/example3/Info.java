package com.example3;

import java.util.List;
import java.util.Set;

public class Info {
private Student[] s=new Student[2];
private List<Student> stuList;
private Set<Student> stuSet;


public List<Student> getStuList() {
	return stuList;
}

public void setStuList(List<Student> stuList) {
	this.stuList = stuList;
}

public Set<Student> getStuSet() {
	return stuSet;
}

public void setStuSet(Set<Student> stuSet) {
	this.stuSet = stuSet;
}

public Student[] getS() {
	return s;
}

public void setS(Student[] s) {
	this.s = s;
}

}
