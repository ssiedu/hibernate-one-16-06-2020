package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerSearch {
	public static void main(String[] args) {
		
		Session session=Utility.getSF().openSession();
		
		//QBI
		Customer customer=session.get(Customer.class, 1001);
		//System.out.println(customer);
		int code=customer.getCode();
		String name=customer.getName();
		/*
		Address address=customer.getAddress();
		int hno=address.getHno();
		String street=address.getStreet();
		String city=address.getCity();
		*/
		int hno=customer.getAddress().getHno();
		String street=customer.getAddress().getStreet();
		String city=customer.getAddress().getCity();
		System.out.println(code+","+name+","+hno+","+street+","+city);
		
		session.close();


	}
}
