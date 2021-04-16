package com.capg.Lab7;

import java.util.Scanner;

public class EmployeeMainController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int employeeid;
		String name;
		String designation;
		int salary;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee ID :");
		employeeid=sc.nextInt();
		System.out.println("Enter Employee Name:");
		sc.nextLine();
		name=sc.nextLine();
		System.out.println("Enter Designatiob :");
		designation=sc.nextLine();
		System.out.println("Enter salary :");
		salary=sc.nextInt();
		EmployeeService employeeservice=new EmployeeService();
		employeeservice.insuranceScheme(employeeid, salary, name, designation);

	}

}
