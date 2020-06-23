package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

public class QBCExampleOne {

	public static void main(String[] args) {
		
		//we wish to fetch all rows and columns
		//we are using Criteria object here
		
		Session session=Utility.getSF().openSession();
		
		Criteria cr=session.createCriteria(Emp.class);	
		
		Order order1=Order.asc("sal");
		Order order2=Order.asc("ename");
		cr.addOrder(order1);
		cr.addOrder(order2);
			
		List<Emp> employees=cr.list();		//SELECT QUERY GENERATED
		
		for(Emp emp:employees) {
			System.out.println(emp);
		}

	/*	
		for(int i=0; i<employees.size(); i++) {
			Emp emp=employees.get(i);
			System.out.println(emp);
		}*/
		
		
		/*
		for(Emp emp:employees) {
			System.out.println(emp.getEname()+","+emp.getSal());
		}
		*/
		
		session.close();

	}

}
