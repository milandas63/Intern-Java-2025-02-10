package com.gui;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample {
	private JFrame frm;
	
	public BorderLayoutExample() {
		frm = new JFrame("BorderLayout Example");
		frm.setLayout(new BorderLayout());
		
		JLabel lblNorth = new JLabel("NORTH", JLabel.CENTER);
		lblNorth.setBackground(Color.red);
		lblNorth.setOpaque(true);
		frm.add(lblNorth, BorderLayout.NORTH);

		JLabel lblWest = new JLabel("WEST", JLabel.CENTER);
		lblWest.setBackground(Color.green);
		lblWest.setOpaque(true);
		frm.add(lblWest, BorderLayout.WEST);

		JLabel lblCenter = new JLabel("CENTER", JLabel.CENTER);
		lblCenter.setBackground(Color.yellow);
		lblCenter.setOpaque(true);
		frm.add(lblCenter, BorderLayout.CENTER);

		JLabel lblEast = new JLabel("EAST", JLabel.CENTER);
		lblEast.setBackground(Color.blue);
		lblEast.setOpaque(true);
		frm.add(lblEast, BorderLayout.EAST);

		JLabel lblSouth = new JLabel("SOUTH", JLabel.CENTER);
		lblSouth.setBackground(Color.ORANGE);
		lblSouth.setOpaque(true);
		frm.add(lblSouth, BorderLayout.SOUTH);

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setBounds(200, 100, 450, 350);
		frm.setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutExample();
	}

}
