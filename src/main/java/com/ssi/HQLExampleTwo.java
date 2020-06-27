package com.ssi;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HQLExampleTwo {
	public static void main(String[] args) {
		// update/delete using hql
		
		Session session=Utility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		//String hql="update Emp set sal=sal+5000";
		String hql="delete from Emp where eno=:code";
		Query query=session.createQuery(hql);
		query.setParameter("code", 115);
		int n=query.executeUpdate();
		System.out.println(n+" rows modified");
		tr.commit();
	    session.close();
		

	}

}
