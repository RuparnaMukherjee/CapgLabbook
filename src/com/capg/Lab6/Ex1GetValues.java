package com.capg.Lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex1GetValues {

	public ArrayList getValues(HashMap map) {
		ArrayList<String> list=new ArrayList<String>(map.values());
		Collections.sort(list);
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> myMap=new HashMap<Integer,String>();
		ArrayList<String> myList=new ArrayList();
		Ex1GetValues ex1=new Ex1GetValues();
		myMap.put(1, "Amar");
		myMap.put(2, "Akbar");
		myMap.put(3, "Anthony");
		myMap.put(4, "Ruparna");
		myList=ex1.getValues(myMap);
		System.out.println(myList);

	}

}
