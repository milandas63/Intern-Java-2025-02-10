package com.gui;

import java.awt.*;
import javax.swing.*;

public class GridLayoutExample {
	private JFrame frm;
	
	public GridLayoutExample() {
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

		JButton btnDay;
		String[] days = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		JPanel pnlCenter = new JPanel(new GridLayout(6,7));
		frm.add(pnlCenter);
		for(String day : days) {
			btnDay = new JButton(day);
			pnlCenter.add(btnDay);
		}
		for(int i=1; i<=31; i++) {
			btnDay = new JButton(String.valueOf(i));
			pnlCenter.add(btnDay);
		}

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
		new GridLayoutExample();
	}

}
