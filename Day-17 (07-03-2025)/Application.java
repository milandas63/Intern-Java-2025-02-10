package com.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Application extends JFrame {
	private JSplitPane split;
	private JScrollPane jsp;
	private JButton btnRegister;
	private JButton btnLogin;
	private JButton btnApplication;
	private JButton btnMarsheet;
	private JButton btnReport;
	
	private JMenuBar mbar;
	private JMenu mnuFile;
	private JMenu mnuEdit;
	private JMenu mnuView;
	private JMenu mnuSearch;
	
	public JInternalFrame iFrame;
	public JDesktopPane desktop;

	public Application() {
		this.setLayout(new BorderLayout());

		mbar = new JMenuBar();
		this.add(mbar, BorderLayout.NORTH);

		mnuFile = new JMenu("File");
			JMenu mnuNew = new JMenu("New");
			JMenuItem mniOpen = new JMenuItem("Open");
			JMenuItem mniClose = new JMenuItem("Close");
			JMenuItem mniCloseAll = new JMenuItem("Close All");
			mnuFile.add(mnuNew);
			mnuFile.add(mniOpen);
			mnuFile.add(mniClose);
			mnuFile.add(mniCloseAll);
			
		mnuEdit = new JMenu("Edit");
		mnuView = new JMenu("View");
		mnuSearch = new JMenu("Search");
		mnuFile.setMnemonic('F');
		mnuEdit.setMnemonic('E');
		mnuView.setMnemonic('V');
		mnuSearch.setMnemonic('S');

		mbar.add(mnuFile);
		mbar.add(mnuEdit);
		mbar.add(mnuView);
		mbar.add(mnuSearch);

		split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true, showLeftMenu(), showRightPane());
		this.add(split, BorderLayout.CENTER);
		split.setDividerLocation(150);


		

		this.setTitle("Student Application");
		this.setIconImage(new ImageIcon("title.png").getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(200,150,800,500);
		this.setVisible(true);
	}

	private JPanel showLeftMenu() {
		JPanel pnl = new JPanel(new GridLayout(15,1));
		btnRegister = new JButton("Register");
		btnLogin = new JButton("Login");
		btnApplication = new JButton("Application");
		btnRegister.addActionListener(new ButtonActionFrame("Register"));
		btnLogin.addActionListener(new ButtonActionFrame("Login"));
		btnApplication.addActionListener(new ButtonActionFrame("Application"));
		pnl.add(btnRegister);
		pnl.add(btnLogin);
		pnl.add(btnApplication);
		return pnl;
	}

	private JDesktopPane showRightPane() {
		desktop = new JDesktopPane();
		return desktop;
	}
	
	public static void main(String[] args) {
		new Application();
	}

	class ButtonActionFrame implements ActionListener {
		private String title;

		public ButtonActionFrame(String title) {
			this.title = title;
		}

		@Override
		public void actionPerformed(ActionEvent ae) {
			iFrame = new JInternalFrame(title);
			iFrame.setBounds(25,25,350,300);
			iFrame.setClosable(true);
			iFrame.setMaximizable(true);
			iFrame.setIconifiable(true);
			
			if(title.equals("Login")) {

			}
			
			desktop.add(iFrame);
			iFrame.setVisible(true);
		}
	}
}
