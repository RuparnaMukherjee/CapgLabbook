package com.capg.Lab4;

public class JournalPaper extends WrittenItem {

	private int year;
//	private int uid;
//	private String title;
//	private int no_of_copies;
//	private String author;
	public JournalPaper(int uid,String title,int no_of_copies,String author,int year) {
		// TODO Auto-generated constructor stub
		super(uid,title,no_of_copies,author);
		this.year=year;
	}
	public void print() {
		System.out.println("Journal Id:"+getUid());
		System.out.println("Journal Title:"+getTitle());
		System.out.println("Journal Author:"+getAuthor());
		System.out.println("Publish Year:"+year);
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
