package com.capg.Lab2;

import java.util.*;

public class Ex1GetSecondSmallest {
	static int getSecondSmallest(int n[]) {
		Arrays.sort(n);
		return n[1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println(getSecondSmallest(arr));

	}

}
