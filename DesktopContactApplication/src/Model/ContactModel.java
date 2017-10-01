package Model;

public class ContactModel {

	private String name;
	private String phoneNumber;
	private String adress;
	private String email;
	private String note;

	public ContactModel(String name, String phoneNumber, String adress, String email, String note) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.adress = adress;
		this.email = email;
		this.note = note;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	

}
