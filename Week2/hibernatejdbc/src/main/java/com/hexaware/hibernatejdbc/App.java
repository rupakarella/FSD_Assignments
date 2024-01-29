package com.hexaware.hibernatejdbc;

import java.util.List;
import java.util.Scanner;

import com.hexaware.hibernatejdbc.config.HibernateConfig;
import com.hexaware.hibernatejdbc.dao.IUsersDao;
import com.hexaware.hibernatejdbc.dao.UsersDaoImp;
import com.hexaware.hibernatejdbc.entity.Users;
import com.hexaware.hibernatejdbc.service.IUsersService;
import com.hexaware.hibernatejdbc.service.UsersServiceImp;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static IUsersDao dao = new UsersDaoImp();
    private static IUsersService service=new UsersServiceImp();

    public static void main(String[] args) {
        boolean flag = true;

        try {
            while (flag) {
                System.out.println("***WELCOME DMS***");
                System.out.println("1.INSERT");
                System.out.println("2.UPDATE");
                System.out.println("3.DELETE");
                System.out.println("4.SELECT BY ID");
                System.out.println("5.SELECT ALL");
                System.out.println("6.EXIT");
                System.out.println("Enter your choice (1-6)");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        Users user = readData();
                        Users user1=service.createUser(user);
                        System.out.println(user1+" inserted successfully");
                        break;
                    case 2:
                        Users updatedUser = readData();
                        Users user2=service.updateUser(updatedUser);
                        System.out.println("Record updated");
                        break;
                    case 3:
                        System.out.println("Enter User Id");
                        int userId = scanner.nextInt();
                        Users userfound=service.selectUserById(userId);
                        if (userfound != null) {
                            dao.deleteUserById(userId);
                            System.out.println(userfound+" has been deleted");
                        } else {
                            System.out.println("User Not Found");
                        }
                        break;
                    case 4:
                        System.out.println("Enter User Id");
                        int userId1 = scanner.nextInt();
                        Users userFound = service.selectUserById(userId1);
                        if (userFound != null) {
                            System.out.println(userFound);
                        } else {
                            System.out.println("User Not Found");
                        }
                        break;
                    case 5:
                        List<Users> list = service.selectAllUsers();
                        for (Users user3 : list) {
                            System.out.println(user3);
                        }
                        break;
                    case 6:
                        flag = false;
                        break;
                    default:
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the scanner
            if (scanner != null) {
                scanner.close();
            }

            // Close any resources or connections related to Hibernate
            HibernateConfig.shutdown();
        }
    }

    private static Users readData() {
        Users user = new Users();
        try {
            System.out.println("Enter UserId");
            user.setUserId(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Enter Name");
            user.setName(scanner.next());
            System.out.println("Enter Age");
            user.setAge(scanner.nextInt());
            System.out.println("Enter Salary");
            user.setSalary(scanner.nextInt());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
