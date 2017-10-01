package Model;

import java.rmi.NoSuchObjectException;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class ContactBookModel extends DefaultTableModel {

	private static ContactBookModel firstInstance = null;

	private ContactBookModel() {
		setColumnIdentifiers(new String[] { "Name", "Phone", "Adress", "Email", "Note" });
		
	}

	public static ContactBookModel getInstace() {
		if (firstInstance == null) {
			firstInstance = new ContactBookModel();
		}
		return firstInstance;
	}

	static ArrayList<ContactModel> contacts = new ArrayList<ContactModel>();

	public ContactModel findName(String name) throws NoSuchObjectException {
		for (ContactModel contact : contacts) {
			if (contact.getName().contains(name)) {
				return contact;
			}
		}
		throw new NoSuchObjectException("The contact doest exist");
	}

	public void addContact(String name, String phone, String adress, String email, String note) {

		contacts.add(new ContactModel(name, phone, adress, email, note));
		Object[] myList = new Object[5];
		myList[0] = name;
		myList[1] = phone;
		myList[2] = adress;
		myList[3] = email;
		myList[4] = note;
		addRow(myList);
	}
	
	public void updateContact(String name, ContactModel model){
		for(int i = 0; i < this.getRowCount(); i++){
			if(name.equals(this.getValueAt(i, 0))){
				this.setValueAt(model.getNote(), i, 4);
			}
		}
		fireTableDataChanged();
	}
	
	
	
}
