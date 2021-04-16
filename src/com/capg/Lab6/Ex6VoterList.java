package com.capg.Lab6;

import java.util.HashMap;
import java.util.Map;
public class Ex6VoterList {

	public HashMap<Integer,String> getStudents(HashMap<Integer,Integer> a) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		for(Map.Entry m:a.entrySet()) {
			if((int)m.getValue()>=18) 
				map.put((int)m.getKey(),"Elligible");
			else
				map.put((int)m.getKey(),"Not Eligible");
		}
		return map;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		Ex6VoterList ex=new Ex6VoterList();
		map.put(1, 75);
		map.put(2, 17);
		map.put(3, 20);
		map1=ex.getStudents(map);
		System.out.println(map1);
	}

}
