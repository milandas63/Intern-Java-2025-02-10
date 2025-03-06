package com.gui;

import java.awt.*;
import javax.swing.*;

public class Login extends JFrame {
	private JTextField tfUsername;
	private JPasswordField pfPassword;
	private JButton btnSubmit;
	private JButton btnClear;
	private JButton btnExit;

	public Login() {
		this.setTitle("Login");
		this.setLayout(new BorderLayout());

		JLabel lblTitle = new JLabel("Login",JLabel.CENTER);
		this.add(lblTitle, BorderLayout.NORTH);
		lblTitle.setFont(new Font("Arial",Font.BOLD,18));
		lblTitle.setBackground(Color.blue);
		lblTitle.setForeground(Color.yellow);
		lblTitle.setOpaque(true);

		JPanel pnlAll = new JPanel(new BorderLayout()) {
			private static final long serialVersionUID = 1L;
			public Insets getInsets() {
				return new Insets(25,25,25,25);
			}
		};
		this.add(pnlAll, BorderLayout.CENTER);
			JPanel pnlWest = new JPanel(new GridLayout(8,1));
			pnlAll.add(pnlWest, BorderLayout.WEST);
			pnlWest.add(new JLabel(""));
			pnlWest.add(new JLabel(""));
			pnlWest.add(new JLabel(""));
			pnlWest.add(new JLabel("Uesrname: "));
			pnlWest.add(new JLabel("Password: "));
			pnlWest.add(new JLabel(""));
			pnlWest.add(new JLabel(""));
			pnlWest.add(new JLabel(""));
	
			JPanel pnlEast = new JPanel(new GridLayout(8,1));
			pnlAll.add(pnlEast, BorderLayout.CENTER);
			tfUsername = new JTextField();
			pfPassword = new JPasswordField();
			pnlEast.add(new JLabel(""));
			pnlEast.add(new JLabel(""));
			pnlEast.add(new JLabel(""));
			pnlEast.add(tfUsername);
			pnlEast.add(pfPassword);
			pnlEast.add(new JLabel(""));
			pnlEast.add(new JLabel(""));
			pnlEast.add(new JLabel(""));
	
			JPanel pnlButton = new JPanel(new GridLayout(1,5));
			pnlAll.add(pnlButton, BorderLayout.SOUTH);
			btnSubmit = new JButton("Submit");
			btnClear = new JButton("Clear");
			btnExit = new JButton("Exit");
			pnlButton.add(new JLabel(""));
			pnlButton.add(btnSubmit);
			pnlButton.add(btnClear);
			pnlButton.add(btnExit);
			pnlButton.add(new JLabel(""));

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(400,200,400,330);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Login();
	}

}
