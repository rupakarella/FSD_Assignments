package presentation;

import java.util.List;
import java.util.Scanner;

import dao.DeptDaoImp;
import dao.IDeptDao;
import entity.Department;

public class Client 
{
	static Scanner scanner= new Scanner(System.in);
	public static void main(String[] args) 
	{	
		IDeptDao dao =new DeptDaoImp();
		boolean flag= true;
		while(flag)
		{
			System.out.println("***WELCOME DMS***");
			System.out.println("1.INSERT");
			System.out.println("2.UPDATE");
			System.out.println("3.DELETE");
			System.out.println("4.SELECT BY ID");
			System.out.println("5.SELECT ALL");
			System.out.println("6.EXIT");
			System.out.println("Enter your choice(1-6)");
			
			int choice = scanner.nextInt();
			switch(choice)
			{
				case 1:
					Department dept=readData();
					int count=dao.insertDept(dept);
					System.out.println(count+" record inserted successfully");
					break;
				case 2:
					Department dept1=readData();
					int count1=dao.updateDept(dept1);
					System.out.println(count1+" record updated successfully");
					break;
				case 3:
					System.out.println("Enter DNo");
					int dno=scanner.nextInt();
					int count2=dao.deleteOne(dno);
					System.out.println(count2+" record deleted successfully");
					break;
				case 4:
					System.out.println("Enter DNo");
					int dno1=scanner.nextInt();
					Department dept2=dao.selectOne(dno1);
					System.out.println(dept2);
					break;
				case 5:
					List<Department> list= dao.selectAll();
					list.stream().forEach(System.out::println);
					break;
				case 6:
					flag=false;
					break;
				default:
					break;	
			}
		}
	}
	public static Department readData()
	{
		System.out.println("Enter DNo");
		int dno= scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter DName");
		String dname=scanner.nextLine();
		System.out.println("Enter Location");
		String location=scanner.nextLine();
		
		Department dept= new Department(dno,dname,location);
		return dept;
	}
}
