package com.gui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Introduction {
	private JFrame frm;
	
	public Introduction() {
		frm = new JFrame("Example App");
		frm.setTitle("My first GUI program");
		frm.setIconImage(new ImageIcon("bird.png").getImage());
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setBounds(200, 100, 600, 450);
		frm.setVisible(true);
	}

	public static void main(String[] args) {
		new Introduction();
	}

}
