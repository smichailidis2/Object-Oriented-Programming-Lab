/**
 * Author TUC.ECE.MUSIC
 * This package was created for usage in the cs102 course
 *  
 * @version 1.0
 */
package tuc.ece.cs102.lib;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

/**
 * 
 */
public class LendingLibrary {

	private String libraryName;
	private String libraryAddress;

	/* Library's books */
	private Book[] listOfBooks;
	private int numOfBooks;

	/* Library's lendings */
	private Lending[] listOfLendings;
	private int numOfLendings;

	/* Library's students */
	private Student[] listOfStudents;
	private int numOfStudents;

	/************************* Class constructors ********************/

	public LendingLibrary() {		
		listOfBooks = new Book[50];
		listOfLendings = new Lending[100];
		listOfStudents = new Student[50];
		numOfBooks=0;
		numOfLendings=0;
		numOfStudents=0;
	}

	public LendingLibrary(String name, String address) {
		libraryName = name;
		libraryAddress = address;
		listOfBooks = new Book[50];
		listOfLendings = new Lending[100];
		listOfStudents = new Student[50];
		numOfBooks=0;
		numOfLendings=0;
		numOfStudents=0;
	}

	/* *************************** Set Methods ***********************/

	public void setLibraryName(String name) {
		libraryName = name;
	}

	public void setLibraryAddress(String address) {
		libraryAddress = address;
	}

	/* *************************** Get Methods ***********************/

	public String getLibraryName() {
		return libraryName;
	}

	public String getLibraryAddress() {
		return libraryAddress;
	}

	public Book[] getListOfBooks() {
		return listOfBooks;
	}

	public Lending[] getListOfLendings() {
		return listOfLendings;
	}

	public Student[] getListOfStudents() {
		return listOfStudents;
	}

	public void addBook(Book b) {
		listOfBooks[numOfBooks]=b;
		numOfBooks++;
	}

	public void addStudent(Student s) {
		listOfStudents[numOfStudents]=s;
		numOfStudents++;
	}

	public void addLending(Lending l) {
		listOfLendings[numOfLendings]=l;
		numOfLendings++;
	}

	public void addNewLending(Student s, Book b) {
		if (s != null && b != null) {
			if (b.getNumOfLentCopies() < b.getNumOfTotalCopies()) {
				// Create the calendar object to help in date calculations..
				Calendar c = Calendar.getInstance();

				// calculate the lending date (today)
				LocalDate lDate = LocalDate.now();

				// Create the Lending Object
				Lending l = new Lending(lDate, lDate.plusDays(20), s, b);

				// Add it to the list of Lendings
				this.addLending(l);

				// Update Student and Book Objects
				s.addLending(l);
				b.addBookLending(l);
				b.setNumOfLentCopies(b.getNumOfLentCopies() + 1);
				System.out.println("Lending stored successfully!");
			} else {
				System.out.println("Error: This book has no more copies available...");
			}
		} else {
			System.out.println("Error: Undefined Student or Book...");
		}
	}

	/* *************************** Other Methods ***********************/
	public Student findStudentByName(String fName, String lName) {
		for (Student s : this.listOfStudents) {			
			if (s!=null && s.getFirstName().equals(fName) && s.getLastName().equals(lName)) {
				return s;
			}
		}
		return null;
	}

	public Book findBookByTitle(String bTitle) {
		for (Book b: this.listOfBooks) {			 
			if (b!= null && b.getBookTitle().equals(bTitle)) {
				return b;
			}
		}
		return null;
	}

	public void printStudentLendings(String fName, String lName) {
		Student s = this.findStudentByName(fName, lName);
		if (s != null) {
			System.out.println("Lendings of Student " + s.getStudentInfo());
			if (s.getNumOfLendings() > 0) {
				for (Lending l: s.getStudentLendings()) {
					if (l!= null)
					System.out.println(l.getBook().getBookInfo() + " [" + l.getLendingPeriod() + "]");
				}
			} else {
				System.out.println("There are no lendings for this Student");
			}
		}
	}

	public void printStudentsCatalogue() {
		for (Student s: this.listOfStudents) {			
			if (s!=null)
				s.println();
		}
	}

	public void printBooksCatalogue() {
		for (Book b: this.listOfBooks) {
			if (b!=null)
				b.println();
		}
	}

}