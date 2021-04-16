package com.capg.Lab2;
import java.util.*;

public class ModifyArray {
	static int[] modifyArray(int n[]) {
		Arrays.sort(n);
		int k[]=new int[n.length+1];
		int c=0;
		for(int i=0;i<n.length-1;i++)
			if(n[i]!=n[i+1])
			{
				k[c++]=n[i];
			}
		//if(n[n.length-2]!=n[n.length-1])
			k[c++]=n[n.length-1];
		k[n.length]=c;
		return k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int arr1[]=new int[n+1];
		arr1=modifyArray(arr);
		for(int i=arr1[n]-1;i>=0;i--)
			System.out.println(arr1[i]);
		

	}

}
