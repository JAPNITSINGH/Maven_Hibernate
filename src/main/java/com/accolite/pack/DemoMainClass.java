package com.accolite.pack;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;

public class DemoMainClass {
	public static void main(String args[])
	{
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
//		Employee e1 = new Employee("Deep","Unknown");
//		
//		e1.setId(1); e1.setEmail("deep.unknown@accloiteindia.com");
//		session.beginTransaction();
//		//session.save(address);
//		session.save(e1);
//		session.getTransaction().commit();
//		session.close();
//		
//		session = sessionFactory.openSession();
//		session.beginTransaction();
//		String str = session.get(Employee.class, 1).getEmail();
//		System.out.println(str);
//		session.close();
//		
//		session = sessionFactory.openSession();
//		session.beginTransaction();
//		//Address address = new Address("Little Fighter 2 Street");
//		//e1.setAddress(address);
//		//e1.getAddress().setStreetName("Little Fighter 2 Street");
//		e1.setFirstName("John");
//		session.update(e1);
//		session.getTransaction().commit();
//		session.close();
//		
//		session = sessionFactory.openSession();
//		session.beginTransaction();
//		List<Employee> resultList = session.createQuery("from Employee").getResultList();
//		for(Employee e : resultList)
//		{
//			System.out.println(e.getFirstName());
//		}
//		session.getTransaction().commit();
//		session.close();
//		
//		session = sessionFactory.openSession();
//		session.beginTransaction();
//		Criteria criteria = session.createCriteria(Employee.class);
//		criteria.add(Restrictions.eq("id", 1));
//		//criteria.add(Restrictions.eq("id", 1)).add(Restrictions.gt("id", 1));
//		//criteria.add(Restrictions.or(Restrictions.eq("id", 1)),(Restrictions.gt("id", 1)));
//		
//		Employee e2 = new Employee("Henry","Unknown");
//		e2.setEmail("henry.Unknown@accoliteindi.com");
//		//Example ex = new Exmaple(); 
//		session = sessionFactory.openSession();
//		session.beginTransaction();
//		Address address = new Address("LF Street");
//		OfficeAddress officeAddress = new OfficeAddress("+91 7899046812");
//		HomeAddress homeAddress = new HomeAddress(39039);
//		session.save(address);
//		session.save(officeAddress);
//		session.save(homeAddress);
//		session.getTransaction().commit();
//		session.close();
		CourseEntity c1 = new CourseEntity();
		c1.setCourseName("Algos");
		c1.setSqlTimestamp(java.sql.Timestamp.valueOf("2017-11-15 15:30:14.332"));
		
		CourseEntity c2 = new CourseEntity();
		c2.setCourseName("DBMS");
		c2.setSqlTimestamp(java.sql.Timestamp.valueOf("2018-01-21 21:33:19.340"));
		
		Set<CourseEntity> courses = new HashSet<CourseEntity>();
		courses.add(c1);
		courses.add(c2);
		
		Student s1 = new Student();
		s1.setName("Deep");
		s1.setCourses(courses);
		
		Student s2 = new Student();
		s2.setName("John");
		s2.setCourses(courses);
		
		session.save(s1);
		session.save(s2);
		session.getTransaction().commit();
		
		
	}
}
