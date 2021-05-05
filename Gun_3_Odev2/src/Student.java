public class Student extends User {

	boolean graduated;
		
	public Student (int id,String firstName,String lastName,String userStatus,boolean graduated) {
		super(id, firstName, lastName, userStatus);
		this.graduated=graduated;
		
	}
	
}
