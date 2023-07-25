//program to demonstrate on default and parameterized constructor
package org.tnsif.classandobject;
//class declaration
public class Library {
	
	//public data members
	public long noOfBook;
	public String authorName;
	public String bookName;
	public double price;
	
	//default constructor
	public Library() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("default constructor");
	}
	
	//Parameterized constructor
	public Library(long noOfBook, String authorName, String bookName, double price) {
		super();
		this.noOfBook = noOfBook;
		this.authorName = authorName;
		this.bookName = bookName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Library [noOfBook=" + noOfBook + ", authorName=" + authorName + ", bookName=" + bookName + ", price="
				+ price + "]";
	}
	
	

}
