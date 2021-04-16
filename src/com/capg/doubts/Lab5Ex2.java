package com.capg.doubts;
import java.util.Scanner;

class Name_check extends Exception
{
Name_check(String message)
{
	System.out.println("Name is "+message);
}
}

public class Lab5Ex2 {
	
	public void check(String name,String name1) throws Name_check
	{
		int flag=0;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)>=65 && name.charAt(i)<=90 || (name.charAt(i)>=97 && name.charAt(i)<=122))
			{
				flag=1;
			}
		}
		for(int i=0;i<name1.length();i++)
		{
			if(name1.charAt(i)>=65 && name1.charAt(i)<=90 || (name1.charAt(i)>=97 && name1.charAt(i)<=122))
			{
				flag=2;
			}
		}
		if(flag==2)
			throw new Name_check("correct");
		else
	System.out.println("Incorrect");
		
		}

	public static void main(String[] args) {
		try
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter first name :");
			String str= sc.next();
			//System.out.println("Enter last name :");
			String str1= sc.next();
			Lab5Ex2 nm= new Lab5Ex2();
			nm.check(str,str1);
	}
		catch(Exception e)
		{
			System.out.println("I can handle :"+e);
		}

}
}