/**
 * Author TUC.ECE.MUSIC
 * This package was created for usage in the cs102 course
 *  
 * @version 1.0
 */
package tuc.ece.cs102.lib;
import java.time.LocalDate;
import java.util.Date;

/**
 * 
 */
public class Lending {

	private LocalDate lendingDate;
	private LocalDate expirationDate;
	private Student student;
	private Book book;
	
	/**
	 * Class constructor
	 */
	public Lending() {
		
	}
	
	public Lending(LocalDate lDate, LocalDate expDate, Student s, Book b) {
		lendingDate = lDate;
		expirationDate = expDate;
		student = s;
		book = b;		
	}

/****************************SETTERS***************************************/

	public void setLendingDate(LocalDate lDate) {
		lendingDate = lDate;
	}
	

	public void setExpirationDate(LocalDate expDate) {
		expirationDate = expDate;
	}
	

	public void setStudent(Student s) {
		student = s;
	}
	

	public void setBook(Book b) {
		book = b;
	}
	
/****************************GETTERS***************************************/
	public LocalDate getLendingDate() {
		return lendingDate;
	}
	
	public LocalDate getExpirationDate() {
		return expirationDate;
	}
	
	public Student getStudent() {
		return student;
	}
	
	public Book getBook() {
		return book;
	}
	
	/*Method used to get get (as String) the Lending Period of a Lending object*/	
	public String getLendingPeriod(){
		String result = "";
		result += "From: ";
		result += this.lendingDate.toString();
		
		result += " Until: ";
		result += this.expirationDate.toString();
		
		return result;		
	}
}