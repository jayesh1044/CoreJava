package org.jayesh.serialization;

import java.io.Serializable;

public class Student implements Serializable{

	int roll;
	String fname;
	String lname;
	int contact;
	
	public Student(int roll,String fname, String lname,int contact) {
		this.roll=roll;
		this.fname=fname;
		this.lname=lname;
		this.contact = contact;
	}
	
	public int getRoll() {
		return this.roll;
	}


	public  void setRoll(int roll) {
		this.roll = roll;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public int getContact() {
		return contact;
	}


	public void setContact(int contact) {
		this.contact = contact;
	}
	


	
}
