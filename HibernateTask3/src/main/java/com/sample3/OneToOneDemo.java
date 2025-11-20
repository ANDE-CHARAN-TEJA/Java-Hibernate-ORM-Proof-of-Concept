package com.sample3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		//Person Object
//		
//		Person p1 = new Person();
//		p1.setPid(1001);
//		p1.setPname("charan");
//		BloodGroup b1 = new BloodGroup(1,"A+");
//		p1.setBg(b1);
//		
//		Person p2 = new Person();
//		p2.setPid(1002);
//		p2.setPname("kiran");
//		BloodGroup b2 = new BloodGroup(2,"A-");
//		p2.setBg(b2);
//		
//		session.save(p1);
//		session.save(p2);
//		session.save(b1);
//		session.save(b2);
//		
//		transaction.commit();
		
		Person p1 = (Person) session.get(Person.class, 1001);
		System.out.println(p1.getPname());
		System.out.println(p1.getBg().getBgname());
		
		session.close();
		factory.close();

	}

}
