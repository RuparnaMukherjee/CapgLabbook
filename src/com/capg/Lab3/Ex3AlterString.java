package com.capg.Lab3;

import java.util.*;
public class Ex3AlterString {
	public static String alterString(String n) {
		String s1="";
		for(int i=0;i<n.length();i++)
		{
			char c=n.charAt(i);
			if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
				s1+=c;
			else
				s1+=++c;
			
		}
		return s1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		System.out.println(alterString(n));

	}

}
