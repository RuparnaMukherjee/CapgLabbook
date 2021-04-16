package com.capg.Lab4;

import java.util.Scanner;

public class ClientClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n) {
		case 1:
		Video video = new Video(1,"helloVid",5,15,"Mr T","action","2007");
		break;
		case 2:
		CD cd=new CD(2,"HelloCd",5,15,"Mr T","action");
		cd.print();
		cd.checkIn();
		cd.checkOut();
		cd.addItem();
		break;
		case 3:
		Book book=new Book(5, "Hello book", 5, "Mr T");
		book.print();
		book.checkIn();
		book.checkOut();
		book.addItem();
		break;
		case 4:
			JournalPaper jp=new JournalPaper(5, "Hello Paper ", 5, "Mr T", 2007);
			jp.print();
			jp.checkIn();
			jp.checkOut();
			jp.addItem();
		}
		
		

	}

}
