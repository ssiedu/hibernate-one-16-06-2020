package com.ssi;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpDelete {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Eno to be deleted : ");
		int code=sc.nextInt();
		
		Emp emp=new Emp(); 
		emp.setEno(code);
	
		//SessionFactory sessionFactory=Utility.getSF();
		//Session session=sessionFactory.openSession();
		Session session=Utility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.delete(emp);//delete from emp where eno=?
		tr.commit();
		session.close();
		System.out.println("RECORD DELETED ....!");
		
	}

}
