package com.capg.Lab6;

import java.util.Arrays;
import java.util.Collections;

public class Ex7GetSorted {
	
	public int[] getSorted(int a[]) {
		for(int i=0;i<a.length;i++)
		{
			String s=Integer.toString(a[i]);
			StringBuilder s1=new StringBuilder();
			s1.append(s);
			s1.reverse();
			a[i]=Integer.parseInt(s1.toString());
		}
		Arrays.sort(a);
		return a;
	}

	public static void main(String[] args) {
		Ex7GetSorted ob=new Ex7GetSorted();
		// TODO Auto-generated method stub
		int arr[]= {4321,1234,56,65,78,22};
		arr=ob.getSorted(arr);
		for(int i:arr)
			System.out.println(i);
	}

}
