package com.capg.Lab4;

public abstract class Item {
	private int uid;
	public int getUid() {
		return uid;
	}
	public String getTitle() {
		return title;
	}
	public int getNo_of_copies() {
		return no_of_copies;
	}
	private String title;
	private int no_of_copies;
	Item(int uid,String title,int no_of_copies){
		this.uid=uid;
		this.title=title;
		this.no_of_copies=no_of_copies;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return uid+title+no_of_copies;
	}
	public abstract void print();
	public abstract void checkIn();
	public abstract void checkOut();
	public abstract void addItem();

}
