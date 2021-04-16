package com.capg.Lab4;

public class Book extends WrittenItem {

	public Book(int uid,String title,int no_of_copies,String author) {
		// TODO Auto-generated constructor stub
		super(uid,title,no_of_copies,author);
	}
	public void print() {
		System.out.println("Book Id:"+getUid());
		System.out.println("JBook Title:"+getTitle());
		System.out.println(" Author:"+getAuthor());
		//System.out.println("Publish Year:"+year);
		System.out.println("No of copies available:"+getNo_of_copies());
	}
	public void checkIn() {
		System.out.println("Checked In at XX Station ");
	}
	public void checkOut() {
		System.out.println("Checked Out at XY Station ");
	}
	public void addItem() {
		System.out.println("No option for adding available right now");
	}

}
