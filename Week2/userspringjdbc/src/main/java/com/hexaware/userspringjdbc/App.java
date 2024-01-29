package com.hexaware.userspringjdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.userspringjdbc.model.Users;
import com.hexaware.userspringjdbc.config.AppConfig;
import com.hexaware.userspringjdbc.exception.UserNotFoundExp;
import com.hexaware.userspringjdbc.service.IUsersService;
import com.hexaware.userspringjdbc.service.UsersServiceImp;

public class App 
{
    static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		IUsersService service = context.getBean(UsersServiceImp.class);
		boolean flag = true;
		while (flag) {
			System.out.println("***WELCOME DMS***");
			System.out.println("1.INSERT");
			System.out.println("2.UPDATE");
			System.out.println("3.DELETE");
			System.out.println("4.SELECT BY ID");
			System.out.println("5.SELECT ALL");
			System.out.println("6.EXIT");
			System.out.println("Enter your choice(1-6)");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				Users user = readData();
				boolean isInserted = service.createUser(user);
				if (isInserted) {
					System.out.println("Record inserted successfully");
				} else {
					System.err.println("insert fail");
				}
				break;
			case 2:
				Users updatedUser = readData();
				boolean isUpdated = service.updateUser(updatedUser);
				if (isUpdated) {
					System.out.println("Record updated");
				} else {
					System.err.println("Update fail");
				}
				break;
			case 3:
				System.out.println("Enter User Id");
				int userId = scanner.nextInt();
				try {
					boolean isDeleted = service.deleteUserById(userId);
					if (isDeleted) {
						System.out.println("User Deleted");
					} else {
						throw new UserNotFoundExp("User Not Found");
					}
				}
				catch (UserNotFoundExp e) 
				{
	                  System.err.println(e.getMessage());
	            }
				break;
			case 4:
				System.out.println("Enter User Id");
				int userId1 = scanner.nextInt();
				 try {
                     Users userFound = service.selectUserById(userId1);
                     if (userFound != null) {
                         System.out.println(userFound);
                     } else {
                         throw new UserNotFoundExp("User Not Found");
                     }
                 } catch (UserNotFoundExp e) {
                     System.err.println(e.getMessage());
                 }
				break;
			case 5:
				List<Users> list = service.selectAllUsers();
				for (Users user2 : list) {
					System.out.println(user2);
				}
				break;

			case 6:
				flag = false;
				break;
			default:
				break;
			}
		}

	}

	public static Users readData() {
		Users user = new Users();
		System.out.println("Enter UserId");
		user.setUserId(scanner.nextInt());
		scanner.nextLine();
		System.out.println("Enter Name");
		user.setName(scanner.next());
		System.out.println("Enter Age");
		user.setAge(scanner.nextInt());
		System.out.println("Enter Salary");
		user.setSalary(scanner.nextInt());
		return user;
	}
}