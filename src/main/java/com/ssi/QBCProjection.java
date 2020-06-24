package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class QBCProjection {
	public static void main(String[] args) {
		
		Session session = Utility.getSF().openSession();
		
		Criteria cr = session.createCriteria(Emp.class);
		//we wish to fetch ename,sal only (dont want eno and desg)
		cr.addOrder(Order.desc("eno"));
		cr.add(Restrictions.le("eno", 114));
		Projection proj=Projections.property("eno");
		cr.setProjection(proj);
		
		List<Integer> nos=cr.list();//all rows and cols 
		for(Integer no:nos) {
			System.out.println(no);
		}
		
		/*
		Projection proj=Projections.property("ename");
		cr.setProjection(proj);
		
		
		List<String> names=cr.list();//all rows and cols 
		for(String name:names) {
			System.out.println(name);
		}
		*/
		
		session.close();

	}
}
