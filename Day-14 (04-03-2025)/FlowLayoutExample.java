package com.gui;

import java.awt.*;
import javax.swing.*;

public class FlowLayoutExample {
	private JFrame frm;
	private JButton btnColor;
	private String[] colors = {"Red","Green","Blue","Yellow","Orange","Magenta","Pink","Black","White","Gray","Cyan","LightYellow","DarkOrange"};
	
	public FlowLayoutExample() {
		frm = new JFrame("FlowLayout Example");
		frm.setLayout(new FlowLayout(FlowLayout.RIGHT));
		for(int i=0; i<colors.length; i++) {
			btnColor = new JButton(colors[i]);
			frm.add(btnColor);
		}

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setBounds(200, 100, 450, 350);
		frm.setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayoutExample();
	}

}
