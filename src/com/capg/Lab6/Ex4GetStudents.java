package com.capg.Lab6;

import java.util.HashMap;
import java.util.Map;
public class Ex4GetStudents {

	public HashMap<Integer,String> getStudents(HashMap<Integer,Integer> a) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		for(Map.Entry m:a.entrySet()) {
			if((int)m.getValue()>=90) 
				map.put((int)m.getKey(),"gold");
			else if((int)m.getValue()>=80 && (int)m.getValue()<90)
				map.put((int)m.getKey(),"Silver");
			else if((int)m.getValue()>=70 && (int)m.getValue()<80)
				map.put((int)m.getKey(),"Bronze");
		}
		return map;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		Ex4GetStudents ex=new Ex4GetStudents();
		map.put(1, 75);
		map.put(2, 95);
		map.put(3, 80);
		map1=ex.getStudents(map);
		System.out.println(map1);
	}

}
