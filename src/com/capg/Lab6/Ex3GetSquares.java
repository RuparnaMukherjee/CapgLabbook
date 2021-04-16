package com.capg.Lab6;

import java.util.HashMap;
import java.util.Map;

public class Ex3GetSquares {
	
	public HashMap getSquares(int a[]) {
		HashMap map=new HashMap();
		for(int i=0;i<a.length;i++)
			map.put(a[i], a[i]*a[i]);
		return map;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,6,2};
		HashMap map=new HashMap();
		Ex3GetSquares ex3=new Ex3GetSquares();
		map=ex3.getSquares(a);
		System.out.println(map);
		

	}

}
