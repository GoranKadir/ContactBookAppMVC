package View;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;

public class NoteView extends JFrame {

	private JTextField noteField;
	private JTextField searchField;
	private JButton sendButton;

	public NoteView() {

		setBounds(100, 100, 484, 461);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel SearchTitle = new JLabel("Search for users");
		SearchTitle.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		SearchTitle.setBounds(114, 11, 244, 65);
		getContentPane().add(SearchTitle);
		Image noteIcon = new ImageIcon(this.getClass().getResource("/note-icon.png")).getImage();

		JLabel typeAnoteTitle = new JLabel("Type a note");
		typeAnoteTitle.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		typeAnoteTitle.setBounds(151, 125, 131, 29);
		getContentPane().add(typeAnoteTitle);

		searchField = new JTextField();
		searchField.setBounds(40, 74, 361, 40);
		getContentPane().add(searchField);
		searchField.setColumns(10);

		noteField = new JTextField();
		noteField.setBounds(67, 182, 297, 191);
		getContentPane().add(noteField);
		noteField.setColumns(10);

		sendButton = new JButton("Send");
		sendButton.setBounds(339, 384, 89, 23);
		getContentPane().add(sendButton);

		JLabel lblNewLabel = new JLabel("New label");
		Image backgroundImage = new ImageIcon(this.getClass().getResource("/backgroundImg.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(backgroundImage));
		lblNewLabel.setBounds(0, 0, 478, 432);
		getContentPane().add(lblNewLabel);
	}
	
	public void searchFieldListener(ActionListener listenOnSearchField){
		searchField.addActionListener(listenOnSearchField);
	}
	public void noteFieldListener(ActionListener listenOnNoteField){
		noteField.addActionListener(listenOnNoteField);
	}
	public void sendButtonListener(ActionListener listenOnsendButton){
		sendButton.addActionListener(listenOnsendButton);
	}
	
	public String getSearchField(){
		return searchField.getText();
	}
	public String getNoteField(){
		return noteField.getText();
	}
	


}
