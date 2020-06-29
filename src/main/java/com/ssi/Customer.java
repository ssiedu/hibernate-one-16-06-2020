package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private int code;
	private String name;
	private Address address;
	
	
	public Customer() {
		super();
	}
	public Customer(int code, String name, Address address) {
		super();
		this.code = code;
		this.name = name;
		this.address = address;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [code=" + code + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
