package com.capg.Lab5;

class AgeNotSupportException extends Exception{
	public AgeNotSupportException(String Message) {
		// TODO Auto-generated constructor stub
		System.out.println("Your age is "+Message);
	}
}


public class Lab5_ex1 {
	int age=15;
	public void myData() throws AgeNotSupportException{
		if(age<=15)
		throw new AgeNotSupportException("Not Eligible");
		else
			System.out.println("Eligible");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Lab5_ex1 ud=new Lab5_ex1();
		ud.myData();
		}
		catch(Exception e) {
			System.out.println("Exception handle "+e);
		}

	}

}