
public class Student {
	private int am;
	private String firstName;
	private String lastName;
	
	
	public Student (int id, String fn, String ln) {
		am=id;
		firstName=fn;
		lastName = ln;
	}


	
	public int getAm() {
		return am;
	}



	public void setAm(int am) {
		this.am = am;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getFullName() {
		return firstName + " " + getLastName();
	}
	
}
