package com.kamal.iterator.model;
/**
 * @author Kamal Chaturvedi
 *
 */
public class Textbook {
	String bookName;
	String bookType;
	
	public Textbook(String bookName, String bookType) {
		super();
		this.bookName = bookName;
		this.bookType = bookType;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
}
