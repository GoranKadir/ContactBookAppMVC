package View;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.table.DefaultTableModel;

import Model.ContactBookModel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;

public class ShowContactsView extends JFrame {
	private JTable table;
	private JButton homeButton, deleteButton;
	
	public ShowContactsView() {

		setBounds(100, 100, 484, 461);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JScrollPane scrollPane = new JScrollPane();

		homeButton = new JButton("Home");
		deleteButton = new JButton("Delete contact");
		deleteButton.setForeground(Color.BLACK);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(27)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(homeButton, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(deleteButton, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
									.addGap(286))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 438, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(22, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(50)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(deleteButton, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
					.addComponent(homeButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(35))
		);

		table = new JTable(ContactBookModel.getInstace());
		
		scrollPane.setViewportView(table);
		getContentPane().setLayout(groupLayout);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		Image backgroundImage = new ImageIcon(this.getClass().getResource("/backgroundImg.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(backgroundImage));
		lblNewLabel.setBounds(0, 0, 478, 432);
		getContentPane().add(lblNewLabel);
	}

	public JTable getTable() {
		return table;
	}

	public void homeButtonListener(ActionListener listenOnHomeButton) {
		homeButton.addActionListener(listenOnHomeButton);
	}
	public void deleteButtonListener(ActionListener listenOnDeleteButton){
		deleteButton.addActionListener(listenOnDeleteButton);
	}
}
