package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.NoSuchObjectException;

import javax.swing.JOptionPane;

import Model.ContactBookModel;
import Model.ContactModel;
import Model.Note;
import View.NoteView;

public class NoteViewController {

	private NoteView noteView;

	private static NoteViewController firstInstance = null;

	private NoteViewController(NoteView noteView) {
		this.noteView = noteView;
		this.noteView.searchFieldListener(new searchListener());
		this.noteView.sendButtonListener(new sendListener());

	}

	public static NoteViewController getInstace() {
		if (firstInstance == null) {
			firstInstance = new NoteViewController(new NoteView());
		}
		return firstInstance;
	}

	class searchListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String nameSearch = noteView.getSearchField();
			try {
				ContactBookModel.getInstace().findName(nameSearch);
				System.out.println("Funkar");
			} catch (NoSuchObjectException e1) {
				JOptionPane.showMessageDialog(null, "No name like that");
				e1.printStackTrace();
			}
		}
	}

	class sendListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			ContactModel contactModel;
			try {
				String typeNote = noteView.getNoteField();
				contactModel = ContactBookModel.getInstace().findName(noteView.getSearchField());
				contactModel.setNote(typeNote);
				ContactBookModel.getInstace().updateContact(noteView.getSearchField(), contactModel);
				ShowContactsController.getInstace().showView();
			} catch (NoSuchObjectException e1) {
				e1.printStackTrace();
			}
			noteView.setVisible(false);
		}
	}

	public void showView() {
		noteView.setVisible(true);
	}
}
