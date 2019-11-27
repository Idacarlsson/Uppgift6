package org.ics.labbar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class PersonApplication {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonApplication window = new PersonApplication();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PersonApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(300, 300, 500, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAdd = new JButton("Add Person");
		btnAdd.setBounds(207, 59, 115, 29);
		frame.getContentPane().add(btnAdd);
		
		JButton btnNewButton = new JButton("Remove Person");
		btnNewButton.setBounds(328, 29, 139, 29);
		buttonGroup.add(btnNewButton);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("All your accounts");
		btnNewButton_3.setBounds(496, 120, 154, 29);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNewButton_2 = new JButton("Add Account");
		btnNewButton_2.setBounds(6, 178, 125, 29);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Find Person");
		btnNewButton_1.setBounds(207, 29, 117, 29);
		frame.getContentPane().add(btnNewButton_1);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(16, 34, 61, 16);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(63, 29, 120, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblIdNbr = new JLabel("ID nbr:");
		lblIdNbr.setBounds(16, 59, 61, 16);
		frame.getContentPane().add(lblIdNbr);
		
		textField_1 = new JTextField();
		textField_1.setBounds(63, 59, 120, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(105, 145, 120, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAccountNbr = new JLabel("Account nbr:");
		lblAccountNbr.setBounds(16, 150, 91, 16);
		frame.getContentPane().add(lblAccountNbr);
		
		JButton btnFindAllYour = new JButton("Find all your accounts");
		btnFindAllYour.setBounds(306, 120, 164, 29);
		frame.getContentPane().add(btnFindAllYour);
		
		JLabel lblNewUser = new JLabel("New User:");
		lblNewUser.setBounds(16, 6, 92, 16);
		frame.getContentPane().add(lblNewUser);
		
		JLabel lblFindUser = new JLabel("Find User:");
		lblFindUser.setBounds(16, 97, 75, 16);
		frame.getContentPane().add(lblFindUser);
		
		JLabel lblIdNbr_1 = new JLabel("ID nbr:");
		lblIdNbr_1.setBounds(16, 125, 61, 16);
		frame.getContentPane().add(lblIdNbr_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(105, 120, 120, 26);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(316, 150, 142, 57);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
	}
	
}
