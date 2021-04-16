package com.capg.Lab4;

public abstract class MediaItem extends Item{

	private int runtime;
	public MediaItem(int uid,String title,int no_of_copies,int runtime) {
		// TODO Auto-generated constructor stub
		super(uid,title,no_of_copies);
		this.runtime=runtime;
	}

}
