package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.ContactBookModel;
import View.AddContactView;
import View.MainWindowView;
import View.NoteView;
import View.ShowContactsView;

public class MainController {

	private MainWindowView mainWindow;
	private ShowContactsView showContacts;
	private AddContactView addContact;
	private NoteView noteView;
	private ShowContactsController showCtr;
	private AddContactController addCtr;

	
	public MainController(MainWindowView mainWindow) {
		this.mainWindow = mainWindow;
		this.mainWindow.noteButtonListner(new NoteListner());
		this.mainWindow.inputAdressButtonListner(new InputContactListner());
		this.mainWindow.adressButtonListner(new contactListener());
	}

	
	class NoteListner implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			NoteViewController.getInstace().showView();
		}
	}

	class contactListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			ShowContactsController.getInstace().showView();
		}
	}
	
	class InputContactListner implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			AddContactController.getInstace().showView();
		}
	}

}
