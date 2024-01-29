package com.hexaware.hibernate;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hibernate.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        System.out.println(sessionFactory);
        Session session=sessionFactory.openSession();
        System.out.println(session);
        Transaction txn=session.beginTransaction();//mandate for dml
        Employee updatedEmp=session.get(Employee.class,101);
        Employee updatedEmp1=session.get(Employee.class,102);
        Employee updatedEmp2=session.get(Employee.class,103);
        Employee updatedEmp3=session.get(Employee.class,104);
        System.out.println(updatedEmp);
        session.delete(updatedEmp);
        session.delete(updatedEmp1);
        session.delete(updatedEmp2);
        session.delete(updatedEmp3);
        
        Employee emp=new Employee(101,"king khan",60000); 
        Serializable ser=session.save(emp);
        System.out.println(ser.toString());
        Employee emp1=session.get(Employee.class,101);
        emp1.setEname("Mr.king khan");
        emp1.setSalary(90000);
        Serializable ser1=session.save(emp1);
        System.out.println("updated record "+ser1.toString());
        
        Employee emp2=new Employee(102,"smith",50000);
        Employee emp3=new Employee(103,"adam",63000); 
        Employee emp4=new Employee(104,"ford",42000);
        session.save(emp2);
        session.save(emp3);
        session.save(emp4);
        
        txn.commit();
    }
}
