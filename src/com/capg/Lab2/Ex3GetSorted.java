package com.capg.Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3GetSorted {
	
	static int[] getSorted(int n[]) {
		for(int i=0;i<n.length;i++) {
			String input=Integer.toString(n[i]);
			StringBuilder input1 = new StringBuilder();
	        input1.append(input);
	        input1.reverse();
	        n[i]=Integer.parseInt(input1.toString());
		}
		Arrays.sort(n);
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		arr=getSorted(arr);
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);

	}

}
