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
	private JTextField txtBalance;
	
	private Controller controller;
	private PersonRegister personRegister;

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
		frame.setBounds(700, 300, 400, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAdd = new JButton("Add Person");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String name = textField.getText();
			String id = textField_1.getText();
			
			controller.addPerson(id, name);
			txtBalance.setText("Person added");
		
			}
		});
		btnAdd.setBounds(6, 99, 115, 29);
		frame.getContentPane().add(btnAdd);
		
		JButton btnNewButton = new JButton("Remove Person");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				String id = textField_1.getText();
				Person tmp = personRegister.findPerson(id);
				
				if(tmp== null) {
					txtBalance.setText("Person doesn't exist");
				}
				else  {
				controller.removePerson(id);
				txtBalance.setText("Person removed");
				}
				
				
			}
		});
		btnNewButton.setBounds(243, 99, 139, 29);
		buttonGroup.add(btnNewButton);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("All your accounts");
		btnNewButton_3.setBounds(496, 120, 154, 29);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		
		JButton btnNewButton_2 = new JButton("Add Account");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nbr = textField_2.getText();
				
			}
		});
		btnNewButton_2.setBounds(100, 170, 125, 29);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Find Person");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				String id = textField_1.getText();
				Person tmp =personRegister.findPerson(id);
				
				if(tmp != null) {
					txtBalance.setText("Person found");
					txtBalance.setText(tmp.getName() + " " + tmp.getPnbr());
				}
				else {
					txtBalance.setText("Person doesn't exist");
							
				}
				
			}
		});
		
		
		
		btnNewButton_1.setBounds(125, 99, 117, 29);
		frame.getContentPane().add(btnNewButton_1);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(16, 34, 61, 16);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(100, 29, 120, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblIdNbr = new JLabel("ID nbr:");
		lblIdNbr.setBounds(16, 59, 61, 16);
		frame.getContentPane().add(lblIdNbr);
		
		textField_1 = new JTextField();
		textField_1.setBounds(100, 64, 120, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(100, 135, 120, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAccountNbr = new JLabel("Account nbr:");
		lblAccountNbr.setBounds(16, 140, 91, 16);
		frame.getContentPane().add(lblAccountNbr);
		
		JButton btnFindAllYour = new JButton("Find all your accounts");
		btnFindAllYour.setBounds(100, 211, 164, 29);
		frame.getContentPane().add(btnFindAllYour);
		
		JLabel lblNewUser = new JLabel("New User:");
		lblNewUser.setBounds(5, 6, 92, 16);
		frame.getContentPane().add(lblNewUser);
		
		txtBalance = new JTextField();
		txtBalance.setBounds(43, 246, 289, 165);
		frame.getContentPane().add(txtBalance);
		txtBalance.setColumns(10);
		
		personRegister = new PersonRegister();
		controller = new Controller(personRegister, frame);
		
	}
	
}
