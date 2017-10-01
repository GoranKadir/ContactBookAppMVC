package Model;

public class Note {

	String note;
	ContactModel contactModel;
	
	
	public Note(String note, ContactModel contactModel) {
		this.note = note;
		this.contactModel = contactModel;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	
}
