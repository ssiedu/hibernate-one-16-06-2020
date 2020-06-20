package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpUpdate {

	public static void main(String[] args) {
		
		Emp emp=new Emp();
		emp.setEno(113);
		emp.setEname("XYZ");
		emp.setSal(75000);
		emp.setDesg("PM");
		
		Session session=Utility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.update(emp);
		tr.commit();
		session.close();
		System.out.println("Data Updated ..... ");
		

	}

}
/*
 * 	to update the row we have update method.
 *  update method can be used only when we wish to update using primary key.
 * 
 * 	update emp set sal=sal+10 where eno=111;
 */
