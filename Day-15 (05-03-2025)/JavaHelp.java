package com.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JavaHelp extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField tfClass;
	private JTextArea taHelp;
	private JButton btnShow;
	private JButton btnExit;
	private JButton btnClear;

	public JavaHelp() {
		this.setLayout(new BorderLayout());
		
		JPanel pnlNorth = new JPanel(new GridLayout(2,1));
		this.add(pnlNorth, BorderLayout.NORTH);
		JLabel lblClass = new JLabel("Enter fully qualified class name: ");
		tfClass = new JTextField();
		pnlNorth.add(lblClass);
		pnlNorth.add(tfClass);
		
		taHelp = new JTextArea();
		taHelp.setFont(new Font("Courier",Font.BOLD,15));
		JScrollPane jsp = new JScrollPane(taHelp);
		this.add(jsp, BorderLayout.CENTER);

		JPanel pnlSouth = new JPanel(new GridLayout(1,3));
		this.add(pnlSouth, BorderLayout.SOUTH);
		btnShow = new JButton("Show");
		btnClear = new JButton("Clear");
		btnExit = new JButton("Exit");
		btnShow.addActionListener(new ButtonEventClass());
		btnClear.addActionListener(new ButtonEventClass());
		btnExit.addActionListener(new ButtonEventClass());
		pnlSouth.add(btnShow);
		pnlSouth.add(btnClear);
		pnlSouth.add(btnExit);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(150,100,900,600);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new JavaHelp();
	}

	private class ButtonEventClass implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String buttonName = e.getActionCommand();
			if(buttonName.equals("Show")) {
				String className = tfClass.getText();
				Reflection refObj = new Reflection(className);
				String classHelp = refObj.getHelpText();
				taHelp.setText(classHelp);
			} else if(buttonName.equals("Clear")) {
				tfClass.setText("");
				taHelp.setText("");
				tfClass.setFocusable(true);
			} else if(buttonName.equals("Exit")) {
				System.exit(0);
			}
		}
		
	}
}
