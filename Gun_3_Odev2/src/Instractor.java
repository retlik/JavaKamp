public class Instractor extends User {

	String dersAdi;
	int dersSaati;
	
	public Instractor(int id, String firstName, String lastName, String userStatus, String dersAdi,
			int dersSaati) {
		super(id, firstName, lastName, userStatus);
		this.dersAdi = dersAdi;
		this.dersSaati = dersSaati;
	}
	
}
