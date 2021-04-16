package com.capg.Lab3;

import java.util.*;
public class Ex1StringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringTokenizer st=new StringTokenizer(s," ");
		int sum=0;
		while (st.hasMoreTokens()) {
			int x=Integer.parseInt(st.nextToken());
	         System.out.println(x);  
	         sum+=x;
	     }  
		System.out.println("sum="+sum);

	}

}
