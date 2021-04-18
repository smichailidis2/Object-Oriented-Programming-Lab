
public class EceSchool {
	private String name;
	Student[] students;
	Course[] courses;

	public EceSchool(String n) {
		this.name=n;
		this.students = new Student[5];
		this.courses = new Course[5];
	}
	
		
	public static void main(String[] args) {	
		EceSchool ece = new EceSchool("HMMY");
		ece.students[0]= new Student(100, "Yannis", "Maragkoudakis");
		ece.students[1] = new Student(101,"Nektarios","Gioldasis");
		ece.students[2] = new Student(102,"Xenia","Arapi");
		ece.students[3] = new Student(103,"Nikos","Pappas");
		
		ece.courses[0] = new Course("PLH101","Programming Intro");
		ece.courses[1] = new Course("PLH102","Structured Programming");
		
		Course c1 = ece.courses[0];
		c1.enrollStudent(ece.students[0]);
		c1.enrollStudent(ece.students[1]);		
		c1.enrollStudent(ece.students[2]);
		c1.enrollStudent(ece.students[3]);
		
		Course c2 = ece.courses[1];
		c2.enrollStudent(ece.students[0]);
		c2.enrollStudent(ece.students[1]);
		
		c1.printEnrolledStudents();
		c2.printEnrolledStudents();
	}

}
