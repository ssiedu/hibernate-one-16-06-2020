package com.ssi;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HQLExampleThree {
	public static void main(String[] args) {
		
		Session session=Utility.getSF().openSession();
		//Query query=session.createQuery("from Emp where sal>=:amount");
		//query.setParameter("amount",75000);
		
		
		Query query=session.createQuery("from Emp where sal between :low and :high");
		query.setParameter("low", 50000);
		query.setParameter("high", 70000);
		List<Emp> employees=query.list();
		for(Emp emp:employees) {
			System.out.println(emp);
		}
		
	    session.close();
		

	}
}
