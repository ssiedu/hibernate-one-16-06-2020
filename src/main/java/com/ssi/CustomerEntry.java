package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerEntry {

	public static void main(String[] args) {
		
		Session session=Utility.getSF().openSession();
		
		
		Address address=new Address();
		address.setHno(501);		address.setStreet("ABRoad");		address.setCity("Indore");
		Customer c1=new Customer();		c1.setCode(1001);		c1.setName("Ravi");		c1.setAddress(address);
		Customer c2=new Customer(1002,"Prince", new Address(905,"MGRoad","Bhopal"));
		Customer c3=new Customer(1003,"Richa", new Address(143,"Palasia","Indore"));
		
		Transaction tr=session.beginTransaction();
		session.save(c1); session.save(c2); session.save(c3);
		tr.commit();
		
		
		session.close();
		System.out.println("Customer Records Stored");

	}

}
