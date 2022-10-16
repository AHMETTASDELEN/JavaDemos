package workspaceKodlamaio.entities;

public class Instructor {
	private int ıd;
    private String firstName;
    private String lastName;
    
    
    
	public Instructor() {
	}

	public Instructor(int id, String firstName, String lastName) {
		ıd = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	
	public int getId() {
		return ıd;
	}


	public void setId(int id) {
		ıd = id;
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
    
    
    
}
