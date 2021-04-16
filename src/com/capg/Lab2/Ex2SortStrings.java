package com.capg.Lab2;

import java.util.*;

public class Ex2SortStrings {
	static String[] sortStrings(String n[]) {
		Arrays.sort(n);
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextLine();
		arr=sortStrings(arr);
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);

	}

}
