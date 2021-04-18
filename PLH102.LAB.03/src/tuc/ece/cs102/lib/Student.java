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
public class Student {

	private String firstName;
	private String lastName;
	private String department;
	private String afm;
	
	private Lending[] studentLendings;
	private int numOfLendings;
	
	/**
	 * Class constructors
	 */
	public Student() {
		this.studentLendings = new Lending[100];
		this.numOfLendings = 0;
	}

	public Student(String fName, String lName, String department, String afm) {
		firstName = fName;
		lastName = lName;
		this.department = department;
		this.afm = afm;
		this.numOfLendings = 0;
		studentLendings = new Lending[100];
	}

	/****************************SETTERS***************************************/

	public void setFirstName(String fName) {
		firstName = fName;
	}

	public void setLastName(String lName) {
		lastName = lName;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setAfm(String afm) {
		this.afm = afm;
	}
	
	//Method to add student lendings one-by-one
	public void addLending(Lending l) {
		studentLendings[numOfLendings]=l;
		numOfLendings++;
	}

	/****************************GETTERS***************************************/
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getDepartment() {
		return department;
	}

	public String getAfm() {
		return afm;
	}

	public Lending[] getStudentLendings() {
		return studentLendings;
	}

	public int getNumOfLendings() {
		return numOfLendings;
	}


	/*Method used to print Student Information*/
	public void print(){
		System.out.print("Fist Name: "+this.firstName + ", Last Name: " + this.lastName + ", AFM: " + this.afm);
	}
	/*Method used to print Student Information and change line*/
	public void println(){
		System.out.println("Fist Name: "+this.firstName + ", Last Name: " + this.lastName + ", AFM: " + this.afm);
	}
	
	/*Method used to get a summary of Student Information*/
	public String getStudentInfo(){
		return this.firstName + ", " + this.lastName + " [" +this.afm + "]";
	}

}