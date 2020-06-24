package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class QBCProjectionTwo {
public static void main(String[] args) {
		
		Session session = Utility.getSF().openSession();
		
		Criteria cr = session.createCriteria(Emp.class);
	
		Projection proj1=Projections.property("eno");
		Projection proj2=Projections.property("ename");
		
		ProjectionList pList=Projections.projectionList();
		pList.add(proj1); pList.add(proj2);
		
		cr.setProjection(pList);
		
		List<Object[]> itemList=cr.list();
		
		for(Object items[]:itemList) {
			for(Object item:items) {
				System.out.println(item);
			}
			System.out.println("_______________________________");
		}
		
		
		session.close();

	}
}
