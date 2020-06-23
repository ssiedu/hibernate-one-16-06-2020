package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class QBCFilteration {
	public static void main(String[] args) {
		Session session = Utility.getSF().openSession();
		Criteria cr = session.createCriteria(Emp.class);

		

		
		//Criterion crt1=Restrictions.ge("sal", 50000);	//>	gt	,		>=	ge
		//cr.add(crt1);
		//Criterion crt1=Restrictions.eq("desg", "PM");
		//cr.add(crt1);
		//Criterion crt1=Restrictions.between("sal", 50000, 60000);
		//cr.add(crt1);
		//Criterion crt1=Restrictions.in("desg","SE","TL");
		//cr.add(crt1);
		Criterion crt1=Restrictions.like("ename", "R%");
		cr.add(crt1);
		List<Emp> employees = cr.list(); 
		
		for (Emp emp : employees) {
			System.out.println(emp);
		}

		session.close();

	}
}
