package com.capg.Lab1;
import java.util.*;
public class Ex7CheckNumber {
	public static boolean checkNumber(int n) {
		int flag=1;
		int a=n%10;
		n=n/10;
		while(n>0) {
			if(a<(n%10))
			{
				flag=0;
				break;
			}
			a=n%10;
			n=n/10;
		}
		if(flag==1)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(checkNumber(n))
			System.out.println("increasing number");
		else
			System.out.println("Not increasing number");
		
	}

}
