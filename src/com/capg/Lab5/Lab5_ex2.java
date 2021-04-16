package com.capg.Lab5;

class FullNameException extends Exception{
	public FullNameException() {
		// TODO Auto-generated constructor stub
		System.out.println("Please Enter Your Full Name");
	}
}

public class Lab5_ex2 {

	String fname=null;
	String lname=null;
	public void validateName()throws Exception{
		if(fname==null || lname==null)
			throw new FullNameException();
		else
			System.out.println("Name is fine");
	}
	public static void main(String[] args) {
		try {
			Lab5_ex2 ex2=new Lab5_ex2();
			ex2.validateName();
		}
		catch(Exception e) {
			System.out.println("Handle Exception :"+e);
		}
		
	}
}
