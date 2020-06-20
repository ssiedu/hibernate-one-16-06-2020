package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpEntry {

	public static void main(String[] args) {
		
		
		
		
		// we wish to save this object in db.
		
		//creating a configuration object to read the data from our configuration file.
		//Configuration config=new Configuration().configure();
		
		//create a SessionFactory object (to create Session object)
		//SessionFactory sessionFactory=config.buildSessionFactory();
		
		//creating a Session instance for performing CRUD operations.
		//Session session=sessionFactory.openSession();
		
		Session session=Utility.getSF().openSession();
		
		
		
		//will insert a record using save method
		Transaction transaction=session.beginTransaction();

		session.save(new Emp(111,"AAA",50000,"SE"));
		session.save(new Emp(112,"BBB",60000,"SSE"));
		session.save(new Emp(113,"CCC",70000,"TL"));
		
		transaction.commit();		
		
		
		
		session.close();
		System.out.println("RECORD STORED");

	}

}
