package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class CustomerList {
public static void main(String[] args) {
		
		Session session=Utility.getSF().openSession();
		
		Criteria cr=session.createCriteria(Customer.class);
		Criterion crt=Restrictions.eq("address.city", "Indore");
		cr.add(crt);
		List<Customer> customers=cr.list();
		for(Customer customer:customers) {
			System.out.println(customer.getCode()+","+customer.getName()+","+customer.getAddress().getCity());
		}
		
		session.close();


	}
}
