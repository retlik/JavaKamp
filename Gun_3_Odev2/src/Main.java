
public class Main {

	public static void main(String[] args) {

		UserManager userManager=new UserManager();
		InstractorManager instractorManager=new InstractorManager();
		StudentManager studentManager=new StudentManager();
		
		// Veri Giri�i �rnek
		
		Student student= new Student(1,"Ramazan","Etlikk","Student",false);
		studentManager.studentAdd(student);	// studentmanager kullan�ld�	
		Instractor instractor= new Instractor(2,"Engin","Demiro�","Instractor","Java",10);
		instractorManager.InsAdd(instractor); //instractormanager kullan�ld�
		
		// User Update
		
		student.setLastName("Etlik");
		userManager.userLastNameUpdate(student);//user manager kullan�ld�	
		
	}

}
