package com.example1;

import java.util.List;
import java.util.Set;

public class Example1 {
private String names[]=new String[5];
private List<String> empnameList;
private Set<Integer> empIdset;
public String[] getNames() {
	return names;
}
public void setNames(String[] names) {
	this.names = names;
}
public List<String> getEmpnameList() {
	return empnameList;
}
public void setEmpnameList(List<String> empnameList) {
	this.empnameList = empnameList;
}
public Set<Integer> getEmpIdset() {
	return empIdset;
}
public void setEmpIdset(Set<Integer> empIdset) {
	this.empIdset = empIdset;
}

}
