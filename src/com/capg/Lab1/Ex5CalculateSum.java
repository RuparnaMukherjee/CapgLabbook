package com.capg.Lab1;
import java.util.*;
public class Ex5CalculateSum {
	public int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++)
			if(i%3==0 || i%5==0)
				sum+=i;
		return sum;
	}
	public static void main(String args[]) {
		Ex5CalculateSum ob=new Ex5CalculateSum();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		System.out.println(ob.calculateSum(n));
	}

}
