package com.capg.doubts;

import java.util.*;
class AgeExcep extends Exception
{
   public String toString()
   {
	   return "User defined exception: Age less than 15 not allowed";
   }
}
public class Exercise1 {

	public void Agecheck(int a)
	{
		if(a>=15)
			System.out.println("Age recorded");
		else
			try
		        {
				   throw new AgeExcep();
		         }
		     catch(Exception e)
		         {
		    	    System.out.println("Exception handled");
		         }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		n=sc.nextInt();
		Exercise1 ex=new Exercise1();
		//ex.Agecheck(n);

	}

}