package com.capg.doubts;
import java.util.*;
class NameExcep extends Exception
{
 public String toString()
 {
	 return "Userdefined Exception:Name field cannot be Null";
 }
}
public class Exercise2 {
    public void Name(String s1,String s2)
    {
    	if(!s1.isEmpty() && !s2.isEmpty())
    		System.out.println("Full name: "+s1+" "+s2);
    	else
    		try
    	     {
    			throw new NameExcep();
    	     }
    	    catch(Exception e)
    	     {
    	    	System.out.println("Exception handled");
    	     }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n="";
        String p="";
        Scanner sc=new Scanner(System.in);
        System.out.println("First name");
        n=sc.nextLine();
        System.out.println("Last name");
        p=sc.nextLine();
        Exercise2 ex=new Exercise2();
        ex.Name(n, p);
	}

}