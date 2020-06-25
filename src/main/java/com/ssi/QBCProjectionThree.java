package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class QBCProjectionThree {
public static void main(String[] args) {
		
		Session session = Utility.getSF().openSession();
		
		Criteria cr = session.createCriteria(Emp.class);
	
	
		//Projection proj1=Projections.sum("sal");
		Projection proj1=Projections.avg("sal");
		cr.setProjection(proj1);

		double result=(Double)cr.uniqueResult();
		System.out.println(result);
		
		session.close();

	}
}
