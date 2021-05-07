package dorduncuGunOdev3;

public class Gamer {

	private String firstName;
	private String lastName;
	private String nationalityId;
	private int dateOfBirthYear;

	public Gamer() {
		
	}
	
	public Gamer(String firstName, String lastName, String nationalityId, int dateOfBirthYear) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfBirthYear = dateOfBirthYear;
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


	public String getNationalityId() {
		return nationalityId;
	}


	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}


	public int getDateOfBirthYear() {
		return dateOfBirthYear;
	}


	public void setDateOfBirthYear(int dateOfBirthYear) {
		this.dateOfBirthYear = dateOfBirthYear;
	}
	
	
	
	
	
}
