package com.capg.Lab1;

import java.util.*;
public class Ex6CalculateDifference {
	public int calculateDifference(int n) {
		int x=n*(n+1)*(2*n+1)/6;
		int y=n*(n+1)/2;
		int dif=x-y;
		return dif;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex6CalculateDifference ob=new Ex6CalculateDifference();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
	System.out.println(ob.calculateDifference(n));

	}

}
