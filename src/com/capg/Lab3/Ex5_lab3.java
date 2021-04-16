package com.capg.Lab3;
import java.util.*;

public class Ex5_lab3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int lines=0,words=0,characters=0;
		 while (sc.hasNextLine()) {
			 lines++;
	            String[] tokens = sc.nextLine().split("\\s");
	            words+=tokens.length;
	            characters+=Arrays.toString(tokens).length();
	            System.out.println("----------------enter integer to end ");
	            if(sc.hasNextInt())
	            	break;
	        }
		 System.out.println("lines="+lines);
		 System.out.println("words="+words);
		 System.out.println("characters="+characters);
	}

}
