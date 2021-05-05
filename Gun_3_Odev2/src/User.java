public class User {
	
	private int id;
	private String firstName;
	private String lastName;
	private String userStatus;
	
	public User() {
		
	}	
	
	public User(int id, String firstName, String lastName, String userStatus) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userStatus = userStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}	
	
		
}
