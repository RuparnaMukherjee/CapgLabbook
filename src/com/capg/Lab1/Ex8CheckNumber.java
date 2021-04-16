package com.capg.Lab1;
import java.util.*;
public class Ex8CheckNumber {
	public static boolean checkNumber(int n) {
		int flag=1;
		while(n>1) {
			if(n%2==0)
				n=n/2;
			else if(n%2!=0)
			{
			flag=0;
			break;
			}
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
			System.out.println("power of two");
		else
			System.out.println("Not power of two");
		
	}

}
