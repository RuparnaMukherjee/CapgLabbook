package com.capg.Lab6;

import java.util.HashMap;

public class Ex2CountChars {

	public HashMap<Character,Integer> countChars(char a[]){
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if(map.containsKey(a[i]))
				continue;
			for(int j=i;j<a.length;j++)
			{
				if(a[i]==a[j])
					k++;
			}
			map.put(a[i],k);
		}
		return map;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		Ex2CountChars ex2=new Ex2CountChars();
		char a[]= {'a','b','a','c','c','d','a','e','f','g','a'};
		map=ex2.countChars(a);
		System.out.println(map);
		

	}

}
