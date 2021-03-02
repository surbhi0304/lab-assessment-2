package com.assessment2.customer.dao;

import java.util.Date;

public class Customer {
	private int id;
	private String name;
	private String address;
	private String phoneNumber;
	private Date dob;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public Customer() {
		
	}
	public Customer(int id, String name, String address, String phoneNumber, Date dob) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.dob = dob;
	}
	public Customer(String name, String address, String phoneNumber, Date dob) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.dob = dob;
	}
	
	

}
