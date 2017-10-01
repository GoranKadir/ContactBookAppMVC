package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddContactView extends JFrame{

	private JTextField nameTextField;
	private JTextField adressTextField;
	private JTextField emailTextField;
	private JTextField phoneTextField;
	private JButton saveButton, cancelButton;


	
	public AddContactView() {
		setBounds(100, 100, 481, 447);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		nameTextField = new JTextField();
		nameTextField.setBounds(235, 109, 191, 30);
		getContentPane().add(nameTextField);
		nameTextField.setColumns(10);
		
		adressTextField = new JTextField();
		adressTextField.setBounds(235, 217, 191, 30);
		getContentPane().add(adressTextField);
		adressTextField.setColumns(10);
		
		emailTextField = new JTextField();
		emailTextField.setBounds(235, 269, 191, 30);
		getContentPane().add(emailTextField);
		emailTextField.setColumns(10);
		
		JLabel pictureInputLabel = new JLabel("picture");
		pictureInputLabel.setBounds(10, 11, 134, 135);
		getContentPane().add(pictureInputLabel);
		
		saveButton = new JButton("Save");
		saveButton.setBounds(235, 370, 89, 23);
		getContentPane().add(saveButton);
		
		cancelButton = new JButton("Cancel");
		cancelButton.setBounds(337, 370, 89, 23);
		getContentPane().add(cancelButton);
		
	
		
		JLabel nameLabel = new JLabel("Name:");
		nameLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		nameLabel.setBounds(159, 115, 66, 14);
		getContentPane().add(nameLabel);
		
		JLabel phoneLabel = new JLabel("Phone number:");
		phoneLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		phoneLabel.setBounds(118, 175, 107, 14);
		getContentPane().add(phoneLabel);
		
		JLabel adressLabel = new JLabel("Adress:");
		adressLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		adressLabel.setBounds(159, 223, 59, 14);
		getContentPane().add(adressLabel);
		
		JLabel emailLabel = new JLabel("Email:");
		emailLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		emailLabel.setBounds(159, 275, 66, 14);
		getContentPane().add(emailLabel);
		
		phoneTextField = new JTextField();
		phoneTextField.setBounds(235, 167, 191, 30);
		getContentPane().add(phoneTextField);
		phoneTextField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		Image backgroundImage = new ImageIcon(this.getClass().getResource("/backgroundImg.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(backgroundImage));
		lblNewLabel.setBounds(0, 0, 478, 421);
		getContentPane().add(lblNewLabel);
	}
	
	public void saveButtonListener(ActionListener listenOnSaveButton){
		saveButton.addActionListener(listenOnSaveButton);
		
	}
	
	public String getNameTextField(){
		return nameTextField.getText();
	}
	public String getPhoneTextField(){
		return phoneTextField.getText();
	}
	public String getAdressTextField(){
		return adressTextField.getText();
	}
	public String getEmailTextField(){
		return emailTextField.getText();
	}
}
