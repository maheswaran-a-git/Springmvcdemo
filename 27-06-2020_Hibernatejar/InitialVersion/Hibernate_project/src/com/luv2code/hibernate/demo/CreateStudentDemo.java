package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SessionFactory factory= new Configuration()
//				.configure("hibernate.cfg.xml")
//				.addAnnotatedClass(Student.class)
//				.buildSessionFactory();
		SessionFactory factory;
		try {
	         factory = new Configuration().configure().buildSessionFactory();
	      } catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	      }
		
		
		
		try {
			Session session= factory.openSession();
			Student tempStudent= new Student("Ramesh","Babu","ramesh@luv2code.com");
			
			session.beginTransaction();
			session.save(tempStudent);
			session.save(tempStudent.clone());
			session.getTransaction().commit();
			
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			factory.close();
		}
		
	}

}
