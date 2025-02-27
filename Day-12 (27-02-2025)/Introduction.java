package com.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Introduction {
	private JFrame frm;
	private JTextField tfUsername;
	private JPasswordField pfPassword;
	private JButton btnSubmit;
	private JButton btnExit;
	
	public Introduction() {
		frm = new JFrame("Example App");
		frm.setLayout(null);
		frm.setTitle("My first GUI program");
		frm.setIconImage(new ImageIcon("bird.png").getImage());

		JLabel lblTitle = new JLabel("LOGIN", JLabel.CENTER);
		lblTitle.setFont(new Font("arial",Font.BOLD,20));
		lblTitle.setBackground(Color.lightGray);
		lblTitle.setForeground(Color.blue);
		lblTitle.setOpaque(true);
		lblTitle.setBounds(0,20,600,40);
		frm.add(lblTitle);
		
		JLabel lblUsername = new JLabel("Username: ", JLabel.RIGHT);
		lblUsername.setBounds(100,120,150,30);
		lblUsername.setFont(new Font("arial",Font.BOLD,16));
		lblUsername.setForeground(Color.black);
		lblUsername.setOpaque(false);
		frm.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password: ", JLabel.RIGHT);
		lblPassword.setBounds(100,155,150,30);
		lblPassword.setFont(new Font("arial",Font.BOLD,16));
		lblPassword.setForeground(Color.black);
		lblPassword.setOpaque(false);
		frm.add(lblPassword);
		
		tfUsername = new JTextField();
		tfUsername.setBounds(251,120,200,30);
		frm.add(tfUsername);
		
		pfPassword = new JPasswordField();
		pfPassword.setBounds(251,155,200,30);
		frm.add(pfPassword);

		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(150,250,100,30);
		frm.add(btnSubmit);
		
		btnExit = new JButton("Exit");
		btnExit.setBounds(260,250,100,30);
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Thank you for using this app");
				System.exit(0);
			}
		});
		frm.add(btnExit);
		
		
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setBounds(200, 100, 600, 450);
		frm.setVisible(true);
	}

	public static void main(String[] args) {
		new Introduction();
	}

}
