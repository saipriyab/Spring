package com.example1;

public class Address {
private String dno;
private String street;
public Address(String dno, String street) {
	super();
	this.dno = dno;
	this.street = street;
}
@Override
public String toString() {
	return "Address [dno=" + dno + ", street=" + street + "]";
}

}
