package com.capg.Lab3;

import java.util.*;
public class Ex8PositiveNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		int flag=0;
		for(int i=0;i<n.length()-1;i++)
			if(n.charAt(i)>=n.charAt(i+1)) {
				flag=1;
				break;
			}
		if(flag==1)
			System.out.println("not positive string ");
		else
			System.out.println("postivie string");
				
	}

}
