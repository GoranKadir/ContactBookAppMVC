package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Panel;
import javax.swing.JLabel;

import Controller.MainController;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindowView extends JFrame {

	private JLabel contactAppTitleLabel, backgroundLabel;
	private JButton noteButton, contactButton, inputContactButton;
	
	public MainWindowView() {
		setBounds(100, 100, 484, 461);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
	
		contactAppTitleLabel = new JLabel("Contact Application");
		contactAppTitleLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		contactAppTitleLabel.setBounds(114, 11, 244, 65);
		getContentPane().add(contactAppTitleLabel);
		
		
		noteButton = new JButton("");
		Image noteIcon = new ImageIcon(this.getClass().getResource("/note-icon.png")).getImage();
		noteButton.setIcon(new ImageIcon(noteIcon));
		noteButton.setBounds(69, 117, 96, 96);
		getContentPane().add(noteButton);
		
		contactButton = new JButton("New button");
		Image adressIcon = new ImageIcon(this.getClass().getResource("/AdressBook-icon.png")).getImage();
		contactButton.setIcon(new ImageIcon(adressIcon));
		contactButton.setBounds(285, 117, 96, 96);
		getContentPane().add(contactButton);
		
		inputContactButton = new JButton("Input new contact");
		inputContactButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		Image inputIcon = new ImageIcon(this.getClass().getResource("/plus-icon.png")).getImage();
		inputContactButton.setIcon(new ImageIcon(inputIcon));
		inputContactButton.setBackground(new Color(50, 205, 50));
		inputContactButton.setBounds(69, 254, 300, 65);
		getContentPane().add(inputContactButton);
		
		backgroundLabel = new JLabel("");
		Image backgroundImage = new ImageIcon(this.getClass().getResource("/backgroundImg.jpg")).getImage();
		backgroundLabel.setIcon(new ImageIcon(backgroundImage));
		backgroundLabel.setBounds(0, 0, 484, 461);
		getContentPane().add(backgroundLabel);
		
	}
	
	public void noteButtonListner(ActionListener listenOnNoteButton){
		noteButton.addActionListener(listenOnNoteButton);
	}
	
	public void adressButtonListner(ActionListener listenOnContactButton){
		contactButton.addActionListener(listenOnContactButton);
	}
	
	public void inputAdressButtonListner(ActionListener listenOnInputContactButton){
		inputContactButton.addActionListener(listenOnInputContactButton);
	}
	 
	
}
