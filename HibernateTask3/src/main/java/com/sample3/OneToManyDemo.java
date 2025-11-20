package com.sample3;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
//		
//		//Question1 Object
//		Question q1 = new Question();
//		q1.setQid(1);
//		q1.setQname("What is java?");
//		
//		Question q2 = new Question();
//		q2.setQid(2);
//		q2.setQname("What is Hibernate?");
//		
//		Answer a1 = new Answer();
//		a1.setAid(1);
//		a1.setAname("HTML is Markup Language");
//		
//		Answer a2 = new Answer();
//		a2.setAid(2);
//		a2.setAname("Java is Oops Language");
//		
//		Answer a3 = new Answer();
//		a3.setAid(3);
//		a3.setAname("Hibernate is FrameWork Language");
//		
//		Answer a4 = new Answer();
//		a4.setAid(4);
//		a4.setAname("Java is PlaftForm Independent Language");
//		
//		Answer a5 = new Answer();
//		a5.setAid(5);
//		a5.setAname("Hibernate is Open Source");
//		
//		
//		List<Answer> al1 = new ArrayList<Answer>();
//		al1.add(a2);
//		al1.add(a4);
//		
//		List<Answer> al2 = new ArrayList<Answer>();
//		al2.add(a3);
//		al2.add(a5);
//		
//		q1.setAnswer(al1);
//		q2.setAnswer(al2);
//		
//		a2.setQ(q1);
//		a3.setQ(q2);
//		a4.setQ(q1);
//		a5.setQ(q2);
//				
//		session.save(q1);
//		session.save(q2);
//		session.save(a1);
//		session.save(a2);
//		session.save(a3);
//		session.save(a4);
//		session.save(a5);
//		
//		transaction.commit();
		
		
		// fetching all answers of a question.
		Question q = (Question) session.get(Question.class, 1);
		System.out.println(q.getQname());
		
		for(Answer an : q.getAnswer()) {
			System.out.println(an.getAname());
		}
		
		//fetching question for answer
		Answer a = (Answer) session.get(Answer.class, 3);
		System.out.println(a.getAname());
		System.out.println(a.getQ().getQname());
		
		session.close();
		factory.close();
		
		
	}

}
