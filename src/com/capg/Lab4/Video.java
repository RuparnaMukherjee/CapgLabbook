package com.capg.Lab4;

public class Video extends MediaItem{

	private String director;
	private String genre;
	private String yearReleased;
	public Video(int uid,String title,int no_of_copies,int runtime,String director,String genre,String yearReleased) {
		// TODO Auto-generated constructor stub
		super(uid,title,no_of_copies,runtime);
		this.director=director;
		this.genre=genre;
		this.yearReleased=yearReleased;
	}
	public void print() {
	System.out.println("Item ID:"+getUid());
	System.out.println("Video Title:"+getTitle());
	System.out.println("Video Director:"+director);
	System.out.println("Video Genre:"+genre);
	System.out.println("Year of release:"+yearReleased);
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
