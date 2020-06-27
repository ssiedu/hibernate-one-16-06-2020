package com.ssi;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

public class SQLExample {

	public static void main(String[] args) {
		
		
		
		String sql="select * from emp";
		
		Session session=Utility.getSF().openSession();
		
		SQLQuery query=session.createSQLQuery(sql);
		query.addEntity(Emp.class);
		List<Emp> employees=query.list();
		for(Emp emp: employees) {
			System.out.println(emp);
		}
		
		
		/*
		List<Object[]> employees=query.list();
		
		for(Object ar[]:employees) {
			for(Object obj:ar) {
				System.out.println(obj);
			}
		}
		*/
		session.close();

	}

}
