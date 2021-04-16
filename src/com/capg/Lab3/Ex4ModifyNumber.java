package com.capg.Lab3;
import java.util.*;
public class Ex4ModifyNumber {

	public static String modifyNumber(String n) {
		String s1="";
		int k=0;
		for(int j=1;j<n.length();j++) {
			 k=(n.charAt(j)-n.charAt(j-1));
			 k=Math.abs(k);
			s1=s1+Integer.toString(k);
		}
		s1=s1+n.charAt(n.length()-1);
		return s1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		System.out.println(modifyNumber(n));
	}

}
