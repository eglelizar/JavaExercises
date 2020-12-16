package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class FetchJoinDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Instructor.class)
								 .addAnnotatedClass(InstructorDetail.class)
								 .addAnnotatedClass(Course.class)
								 .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		try {								
			
			session.beginTransaction();			
			
			int theId =1;
			
			Query<Instructor> query =
					session.createQuery("select i from Instructor i "
							+ " JOIN FETCH i.courses "
							+ " WHERE i.id = :theInstructorId",
							Instructor.class);
			query.setParameter("theInstructorId", theId);
			
			Instructor tempInstructor = query.getSingleResult();
			
			System.out.println("luv2code: Instructor: " + tempInstructor);
					
			Query<Course> query1 = session.createQuery("select c from Course c "
                    + "where c.instructor.id=:theInstructorId",    
                    Course.class);

			query1.setParameter("theInstructorId", theId);
			
			List<Course> tempCourses = query1.getResultList();
			
			System.out.println("tempCourses: " + tempCourses);
			
			// now assign to instructor object in memory
			tempInstructor.setCourses(tempCourses);
			
			System.out.println("luv2code: Courses: " + tempInstructor.getCourses());

		
			System.out.println("luv2code: Courses: " + tempInstructor.getCourses());
			
			System.out.println("Done!");
		}
		finally {
			session.close();
			factory.close();
		}

	}

}
