package com.capg.Lab6;

import java.util.*;
import java.util.Arrays;

public class Ex5GetSecondSmallest {

	public int getSecondSmallest(int a[]) {
		List<Integer> list=new ArrayList<Integer>(a.length);
		for(int i:a)
			list.add(i);
		
		Collections.sort(list);
		return (int)list.get(1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,5,3,1,0};
		Ex5GetSecondSmallest ex5=new Ex5GetSecondSmallest();
		System.out.println(ex5.getSecondSmallest(a));

	}

}
