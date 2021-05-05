
public class Main {

	public static void main(String[] args) {

		UserManager userManager=new UserManager();
		InstractorManager instractorManager=new InstractorManager();
		StudentManager studentManager=new StudentManager();
		
		// Veri Girişi Örnek
		
		Student student= new Student(1,"Ramazan","Etlikk","Student",false);
		studentManager.studentAdd(student);	// studentmanager kullanıldı	
		Instractor instractor= new Instractor(2,"Engin","Demiroğ","Instractor","Java",10);
		instractorManager.InsAdd(instractor); //instractormanager kullanıldı
		
		// User Update
		
		student.setLastName("Etlik");
		userManager.userLastNameUpdate(student);//user manager kullanıldı	
		
	}

}
