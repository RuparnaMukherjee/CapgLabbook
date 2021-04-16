package com.capg.Lab5;

class EmployeeException extends Exception{
	public EmployeeException() {
		// TODO Auto-generated constructor stub
		System.out.println("Employee salary must be at least 3000");
	}
}

public class Lab5_ex3 {

	int sal=2000;
	public void checkSalary()throws Exception {
		if(sal<3000)
			throw new EmployeeException();
		else
			System.out.println("Salary is fine ");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Lab5_ex3 ex3=new Lab5_ex3();
			ex3.checkSalary();
		}
		catch(Exception e)
		{
			System.out.println("Handle exception :"+e);
		}

	}

}
