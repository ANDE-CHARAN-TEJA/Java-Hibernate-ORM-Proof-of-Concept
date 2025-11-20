package com.sample3;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToManyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		Developer d1 = new Developer();
//		d1.setDid(101);
//		d1.setDname("Charan");
//		
//		Developer d2 = new Developer();
//		d2.setDid(102);
//		d2.setDname("Teja");
//		
//		List<Developer> dli = new ArrayList<Developer>();
//		dli.add(d1);
//		dli.add(d2);
//		
//		Projects p1 = new Projects();
//		p1.setPid(1);
//		p1.setPname("Ecommerce");
//		
//		Projects p2 = new Projects();
//		p2.setPid(2);
//		p2.setPname("Paytm");
//		
//		Projects p3 = new Projects();
//		p3.setPid(3);
//		p3.setPname("Cars sales");
//		
//		Projects p4 = new Projects();
//		p4.setPid(4);
//		p4.setPname("Nutrition");
//		
//		List<Projects> pli1 = new ArrayList<Projects>();
//		pli1.add(p1);
//		pli1.add(p2);
//		pli1.add(p3);
//		pli1.add(p4);
//		
//		List<Projects> pli2 = new ArrayList<Projects>();
//		pli2.add(p1);
//		pli2.add(p2);
//		pli2.add(p3);
//		pli2.add(p4);
//		
//		d1.setProjects(pli1);
//		d2.setProjects(pli2);
//		
//		p1.setDevelopers(dli);
//		p2.setDevelopers(dli);
//		p3.setDevelopers(dli);
//		p4.setDevelopers(dli);
//		
//		
//		
//		session.save(d1);
//		session.save(d2);
//		session.save(p1);
//		session.save(p2);
//		session.save(p3);
//		session.save(p4);
//
//		
//		transaction.commit();
		
		
		//fetching projects assigned to developer
		Developer d1 = (Developer) session.get(Developer.class, 101);
		System.out.println(d1.getDname());
		
		for(Projects p : d1.getProjects()) {
			System.out.println(p.getPname());
		}
		
		//fetching developers assigned to project
		Projects p1 = (Projects) session.get(Projects.class, 1);
		System.out.println(p1.getPname());
		
		for(Developer d : p1.getDevelopers()) {
			System.out.println(d.getDname());
		}
		
		
		session.close();
		factory.close();
	}

}
