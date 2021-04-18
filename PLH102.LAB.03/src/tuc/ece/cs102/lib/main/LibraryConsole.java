package tuc.ece.cs102.lib.main;

import tuc.ece.cs102.lib.Book;
import tuc.ece.cs102.lib.LendingLibrary;
import tuc.ece.cs102.lib.Student;
import tuc.ece.cs102.util.StandardInputRead;

public class LibraryConsole {
	
	public static void main(String[] args) {
		
		/*Create a new Linbrary*/
		LendingLibrary lib = new LendingLibrary("TUCLibrary","University Campus");
		
		/*Populate the Library's Catalogues */
		lib.addStudent(new Student("Nikos1","Papadopoulos","ECE","102040"));
		lib.addStudent(new Student("Nikos2","Papadopoulos","MPD","102041"));
		lib.addStudent(new Student("Nikos3","Papadopoulos","MHXOP","102042"));
		lib.addStudent(new Student("Nikos4","Papadopoulos","MHPER","102043"));
		lib.addStudent(new Student("Nikos5","Papadopoulos","ARCH","102044"));
		lib.addStudent(new Student("Nikos6","Papadopoulos","ECE","102045"));
		
		lib.addBook(new Book("xxx1","yyy1",100,"TUC","0001"));
		lib.addBook(new Book("xxx2","yyy2",100,"TUC","0002"));
		lib.addBook(new Book("xxx3","yyy3",100,"TUC","0003"));
		lib.addBook(new Book("xxx4","yyy4",100,"TUC","0004"));
		lib.addBook(new Book("xxx5","yyy5",100,"TUC","0005"));
		lib.addBook(new Book("xxx6","yyy6",100,"TUC","0006"));
		
		/*Add some Lendings to play with.*/
		lib.addNewLending(lib.findStudentByName("Nikos3", "Papadopoulos"), lib.findBookByTitle("xxx6"));
		lib.addNewLending(lib.findStudentByName("Nikos3", "Papadopoulos"), lib.findBookByTitle("xxx1"));
		lib.addNewLending(lib.findStudentByName("Nikos3", "Papadopoulos"), lib.findBookByTitle("xxx4"));
		lib.addNewLending(lib.findStudentByName("Nikos1", "Papadopoulos"), lib.findBookByTitle("xxx4"));

		
		/* *************************** PRINT USER MENOU AND HANDLE CHOICES ***********************/   
		int userOption = 0;
		StandardInputRead reader = new StandardInputRead();
		while (userOption!=4){ 
			 printMenu();
	         String userInput = reader.readString("What would you like to do? ");
	            if (userInput == null) {
	                continue;
	            } else {
	                try {
	                    userOption = Integer.parseInt(userInput);
	                } catch (NumberFormatException ex) {
	                    userOption = 0;
	                }
	            }
	            String fName,lName,bTitle; // Variables used to keep user input
	            switch (userOption) {
	                case 0:
	                    continue;
	                case 1:	                    
	                    fName = reader.readString("Give me Student First Name:");
	                    lName = reader.readString("Give me Student Last Name:");
	                    bTitle = reader.readString("Give me Book Title:");
	                    Student s = lib.findStudentByName(fName, lName);
	                    Book b = lib.findBookByTitle(bTitle);	                    
	                    lib.addNewLending(s, b);
	                    reader.readString("Press any key to continue...");
	                    break;
	                case 2:
	                	System.out.println("Library Books:");
	                	lib.printBooksCatalogue();
	                	System.out.println("Library Students:");
	                	lib.printStudentsCatalogue();
	                	reader.readString("Press any key to continue...");
	                    break;
	                case 3:	                    
	                    fName = reader.readString("Give me Student First Name:");
	                    lName = reader.readString("Give me Student Last Name:");
	                    lib.printStudentLendings(fName, lName);
	                    reader.readString("Press any key to continue...");
	                    break;
	                case 4:
	                	
	                case 5:                 
	                	System.out.println("Thanks for using the Lending Library Console...");
	                    break;	                
	                default:	                    
	                    System.out.println("User option " + userOption + " ignored...");
	                    continue;
	            }
		}
		
	}	
	
	public static void printMenu() {
        System.out.println("                 Library Console");
        System.out.println("=======================================================");
        System.out.println("1. Create New Lending..................................");
        System.out.println("2. Print Books & Students .............................");
        System.out.println("3. Print Student Lendings..............................");        
        System.out.println("4. Exit................................................"); 
        System.out.println("=======================================================");
    }


}
