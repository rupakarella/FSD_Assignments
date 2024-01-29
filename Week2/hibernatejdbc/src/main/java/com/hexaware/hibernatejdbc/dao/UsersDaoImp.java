package com.hexaware.hibernatejdbc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hibernatejdbc.config.HibernateConfig;
import com.hexaware.hibernatejdbc.entity.Users;

import java.util.List;

public class UsersDaoImp implements IUsersDao {

    private SessionFactory sessionFactory = HibernateConfig.getSessionFactory();

    @Override
    public Users createUser(Users user) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = null;
            try {
                transaction = session.beginTransaction();
                session.save(user);
                transaction.commit();
                return user;
            } catch (Exception e) {
                if (transaction != null) {
                    transaction.rollback();
                }
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Users updateUser(Users user) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = null;
            try {
                transaction = session.beginTransaction();
                session.update(user);
                transaction.commit();
            } catch (Exception e) {
                if (transaction != null) {
                    transaction.rollback();
                }
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Users deleteUserById(int userId) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = null;
            try {
                transaction = session.beginTransaction();
                Users user = session.get(Users.class, userId);
                if (user != null) {
                    session.delete(user);
                    transaction.commit();
                    return user; 
                }
            } catch (Exception e) {
                if (transaction != null) {
                    transaction.rollback();
                }
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; 
    }

    @Override
    public Users selectUserById(int userId) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Users.class, userId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Users> selectAllUsers() {
        try (Session session = sessionFactory.openSession()) {
            List<Users> userList = session.createQuery("from Users", Users.class).getResultList();
            return userList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    

}
