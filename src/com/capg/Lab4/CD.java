package com.capg.Lab4;

import org.omg.CORBA.PRIVATE_MEMBER;

public class CD extends MediaItem{

	private String artist;
	private String genre;
	public CD(int uid,String title,int no_of_copies,int runtime,String artist,String genre) {
		// TODO Auto-generated constructor stub
		super(uid,title,no_of_copies,runtime);
		this.artist=artist;
		this.genre=genre;
	}
	public void print() {
		System.out.println("Item ID:"+getUid());
		System.out.println("CD Title:"+getTitle());
		System.out.println("CD Artist:"+artist);
		System.out.println("Genre:"+genre);
		System.out.println("No of copies available:"+getNo_of_copies());
		
	}
	public void checkIn() {
		System.out.println("Checked In at CD Station ");
	}
	public void checkOut() {
		System.out.println("Checked Out at CDy Station ");
	}
	public void addItem() {
		System.out.println("No option for adding available right now");
	}

}
