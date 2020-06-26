package com.ssi;




import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HQLExampleOne {

	public static void main(String[] args) {
		// fetching all the records using HQL
		
		Session session=Utility.getSF().openSession();
		Query query=session.createQuery("select eno,ename from Emp where sal>=60000 order by sal desc");
		List<Emp> employees=query.list();
		for(Emp emp:employees) {
			System.out.println(emp);
		}
		
	    session.close();
		

	}

}
