package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Student.class)
								 .buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			
			List<Student> theStudents = session.createQuery("from Student s where s.lastName ='Doe'").list();
			
			for(Student tempStudent : theStudents) {
				System.out.println(tempStudent);
			}
			
			session.getTransaction().commit();

		}
		finally {
			factory.close();
		}

	}

}
