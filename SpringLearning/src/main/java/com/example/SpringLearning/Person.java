package com.example.SpringLearning;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	private String name; 
	private String gender;
	private String netid;
	//private Date dob;
	
	public Person() {}

	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;

		Calendar cal = Calendar.getInstance();
		cal.set(2014, 0, 1);
		//this.dob = cal.getTime();
	}

	@Autowired
	public Person(String name, String gender, Date dob) {
		super();
		this.name = name;
		this.gender = gender;
		//this.dob = dob;
		System.out.println("Person dob: " + dob);
	}
	
	public void setDate(Date dob) {
		System.out.println("setDate dob: " + dob);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		//return dob;
		return null;
	}

	public void setDob(Date dob) {
		//this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getNetid() {
		return netid;
	}

	public void setNetid(String netid) {
		this.netid = netid;
	}

	@Override
	public String toString() {
		return this.name + " -- " + this.gender + " -- " + "" + " -- " + this.netid;
	}

}
