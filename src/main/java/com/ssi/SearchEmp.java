package com.ssi;

import java.util.Scanner;

import org.hibernate.Session;

public class SearchEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Eno to be searched : ");
		int code=sc.nextInt();
		
		Session session=Utility.getSF().openSession();
		
		Emp emp=session.get(Emp.class, code);	//SELECT
		
		System.out.println(emp.getEno());
		System.out.println(emp.getEname());
		System.out.println(emp.getSal());
		System.out.println(emp.getDesg());
		
		session.close();
	}

}
