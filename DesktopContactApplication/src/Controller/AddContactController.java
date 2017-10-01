package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.ContactBookModel;
import Model.ContactModel;
import Model.Note;
import View.AddContactView;
import View.NoteView;
import View.ShowContactsView;

public class AddContactController {

	private AddContactView addContact;
	private NoteView noteView;
	private static AddContactController firstInstance = null;

	private AddContactController(AddContactView addContact) {
		this.addContact = addContact;
		this.addContact.saveButtonListener(new saveListener());
	}

	public static AddContactController getInstace() {
		if (firstInstance == null) {
			firstInstance = new AddContactController(new AddContactView());
		}
		return firstInstance;
	}

	
	class saveListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String name = addContact.getNameTextField();
			String phone = addContact.getPhoneTextField();
			String adress = addContact.getAdressTextField();
			String email = addContact.getEmailTextField();

			ContactBookModel.getInstace().addContact(name, phone, adress, email, null);
			addContact.setVisible(false);
			ShowContactsController.getInstace().showView();
		}
	}
	
	public void showView(){
		addContact.setVisible(true);
	}
}
