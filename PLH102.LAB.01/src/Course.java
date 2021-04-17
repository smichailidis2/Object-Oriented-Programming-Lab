
public class Course {
	private String code;
	private String title;
	private Student[] enrolledStudents;
	private int currentEnrolled;
	
	public Course(String code, String title) {
		this.code = code;
		this.title = title;
		this.currentEnrolled=0;
		this.enrolledStudents = new Student[5];
	}

	public String getCode() {
		return code; //rrrrrrrrrrrrrrrrrr
	}

	public void setCode(String code) {
		this.code = code;  //rrrrrrrrrrrrrrrrrrrrrr
	}

	public String getTitle() {
		return title; //
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Student[] getEnrolledStudents() {
		return enrolledStudents;
	}

	public void setEnrolledStudents(Student[] enrolledStudents) {
		this.enrolledStudents = enrolledStudents;
	}
	
	public void enrollStudent(Student s) {
		this.enrolledStudents[this.currentEnrolled]=s;
		currentEnrolled++;
	}
	
	public void printEnrolledStudents() {
		System.out.print("["+this.code+"] "+this.title+". ");
		System.out.println("Currently Enrolled Students:");
		for (int i=0; i<this.enrolledStudents.length; i++) {
			Student currentStudent = this.enrolledStudents[i];
			if (currentStudent!=null) {
				System.out.println(currentStudent.getAm()+ ": "+currentStudent.getFirstName()+ " "+ currentStudent.getLastName());
			}
		}
	}
	
	
}
