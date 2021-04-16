package com.capg.Lab4;

public abstract class WrittenItem extends Item {

	WrittenItem(int uid,String title,int no_of_copies,String author){
		super(uid,title,no_of_copies);
		this.author=author;
	}
	public abstract void print();
	public abstract void checkIn();
	public abstract void checkOut();
	public abstract void addItem();
	private String author;
	public String getAuthor() {
		return author;
	}
}
