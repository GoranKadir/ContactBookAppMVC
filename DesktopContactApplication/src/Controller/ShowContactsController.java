package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.ContactBookModel;
import View.ShowContactsView;

public class ShowContactsController {

	private ShowContactsView showContacts;
	private static ShowContactsController firstInstance = null;
	
	private ShowContactsController(ShowContactsView showContacts) {
		this.showContacts = showContacts;
		this.showContacts.homeButtonListener(new homeListener());
		this.showContacts.deleteButtonListener(new deleteListener());
	}
	
	public static ShowContactsController getInstace() {
		if (firstInstance == null) {
			firstInstance = new ShowContactsController(new ShowContactsView());
		}
		return firstInstance;
	}
	
	class homeListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			showContacts.setVisible(false);
		}
	}
	
	class deleteListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {	
			int i = showContacts.getTable().getSelectedRow();
			if(i >=0){
				ContactBookModel.getInstace().removeRow(i);
			}
		}
	}
	
	public void showView(){
		showContacts.setVisible(true);
	}
}
