package com.hexaware.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings.entity.Address;
import com.hexaware.mappings.entity.Student;

/**
 * Hello world!
 *
 */
public class OneToOneMapping {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		System.out.println(session);

		

		Student student = new Student(101, "rupa");
		
		//Address address = new Address(29,"Noida",student);
			
		Address address = new Address();
		address.setAddressId(21);
		address.setCity("Mumbai");
		address.setStudent(student);

		Transaction txn = session.beginTransaction();

		session.persist(address);

		txn.commit();

	}
}
