/**
 * Author TUC.ECE.MUSIC
 * This package was created for usage in the cs102 course
 *  
 * @version 1.0
 */
package tuc.ece.cs102.lib;

import java.util.Vector;

/**
 * 
 */
public class Book {

	private String bookTitle;
	private String authorName;
	private int numOfTotalCopies;
	private int numOfLentCopies;
	private String publisher;
	private String isbn;
    private int numOfLendings;
	private Lending[] bookLendings;	
	

	public Book() {		
		this.numOfLentCopies = 0;
		this.bookLendings = new Lending[100];
		this.numOfLendings = 0;

	}
	
	public Book(String title, String author, int tNumOfCopies, String publisher, String isbn) {
		this.bookTitle = title;
		this.authorName = author;
		this.numOfTotalCopies = tNumOfCopies;
		this.publisher = publisher;
		this.isbn = isbn;
		this.numOfLentCopies = 0;
		this.bookLendings = new Lending[100];
		this.numOfLendings = 0;
	}	

/****************************SETTERS***************************************/
	public void setBookTitle(String title) {
		bookTitle = title;
	}
	

	public void setAuthorName(String author) {
		authorName = author;
	}
	

	public void setNumOfTotalCopies(int tNumOfCopies) {
		numOfTotalCopies = tNumOfCopies;
	}
	

	public void setNumOfLentCopies(int lNumOfCopies) {
		numOfLentCopies = lNumOfCopies;
	}
	

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	//Method to add book lendings one by one
	public void addBookLending(Lending l) {
		this.bookLendings[numOfLendings]=l;
		numOfLendings++;
	}

/****************************SETTERS***************************************/	
	
	public String getBookTitle() {
		return bookTitle;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	
	public int getNumOfLentCopies() {
		return numOfLentCopies;
	}
	
	public int getNumOfTotalCopies() {
		return numOfTotalCopies;
	}
	

	public String getPublisher() {
		return publisher;
	}
	

	public String getIsbn() {
		return isbn;
	}
	

	public Lending[] getBookLendings() {
		return bookLendings;
	}
	
	/*Method used to print Book Information*/
	public void print(){
		System.out.print("Title: "+this.bookTitle+ ", Author: " + this.authorName);
	}
	
	/*Method used to print Book Information and change line*/
	public void println(){
		System.out.println("Title: "+this.bookTitle+ ", Author: " + this.authorName);
	}
	
	/*Method used to get a summary of Book Information*/
	public String getBookInfo(){
		return this.isbn+": \""+this.bookTitle+ "\" by \"" + this.authorName + "\"";
	}

}