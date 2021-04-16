package com.capg.Lab3;

import java.util.*;
public class Ex2GetImage {
	public static String getImage(String n) {
		StringBuffer s1=new StringBuffer();
		s1.append(n);
		s1.reverse();
		n=n+"|"+s1.toString();
		return n;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		System.out.println(getImage(n));
	}

}
