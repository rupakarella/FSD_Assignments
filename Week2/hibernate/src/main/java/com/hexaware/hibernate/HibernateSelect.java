package com.hexaware.hibernate;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.hexaware.hibernate.entity.Employee;

public class HibernateSelect {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		
		
		//HQL or JPQL
		String selectQuery="select e from Employee e where e.salary>?1";
		
		Query<Employee> query = session.createQuery(selectQuery);
		query.setParameter(1,30000.0);
		List<Employee> list=query.getResultList();
		for(Employee employee:list) {
			System.out.println(employee);
		}
		//String selectQuery1="select e from Employee e where e.ename like '%i%'";
		
		String selectQuery1="select e from Employee e where e.eid= :empid";
		
		Query<Employee> query1 = session.createQuery(selectQuery1);
		query1.setParameter("empid",101);
		System.out.println(query1.getResultList());
		
		String nativeQuery="select * from Employee_Details";
		NativeQuery<Employee> query2=session.createNativeQuery(nativeQuery,Employee.class);
		List<Employee> list1=query2.getResultList();
		System.out.println("NativeQueryResult");
		System.out.println(list1);
		
		SQLQuery<Employee> query3=session.createSQLQuery(nativeQuery);
		query3.addEntity(Employee.class);
		List<Employee> list2=query3.getResultList();
		System.out.println(list2);
		session.close();
	}

}