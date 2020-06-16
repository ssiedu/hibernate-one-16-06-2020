package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpEntry {

	public static void main(String[] args) {
		
		Emp emp=new Emp(111,"AAA",50000,"SE");
		
		
		// we wish to save this object in db.
		
		Configuration config=new Configuration().configure();
		Session session=config.buildSessionFactory().openSession();
		Transaction tr=session.beginTransaction();
		
		
		session.save(emp);
		
		
		tr.commit();
		session.close();
		System.out.println("RECORD STORED");

	}

}
