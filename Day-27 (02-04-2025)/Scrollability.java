package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Scrollability {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private ResultSetMetaData rsmd;

	public Scrollability() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/barshita", "root", "root");
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = stmt.executeQuery("SELECT * FROM contact");
			rsmd = rs.getMetaData();

			System.out.println("SCROLL-FORWARD");
			for(int i=1; i<=rsmd.getColumnCount(); i++) {
				System.out.print(padC(rsmd.getColumnLabel(i),rsmd.getColumnDisplaySize(i))+" ");
			}
			System.out.println();
			
			while(rs.next()) {
				System.out.println(
						padR(rs.getString(1),rsmd.getColumnDisplaySize(1))+" "+
						padR(rs.getString(2),rsmd.getColumnDisplaySize(2))+" "+
						padR(rs.getString(3),rsmd.getColumnDisplaySize(3))+" "+
						padR(rs.getString(4),rsmd.getColumnDisplaySize(4))+" "+
						padR(rs.getString(5),rsmd.getColumnDisplaySize(5))+" "+
						padR(rs.getString(6),rsmd.getColumnDisplaySize(6))
				);
			}

			System.out.println("SCROLL-BACKWARD");
			for(int i=1; i<=rsmd.getColumnCount(); i++) {
				System.out.print(padC(rsmd.getColumnLabel(i),rsmd.getColumnDisplaySize(i))+" ");
			}
			System.out.println();
			
			while(rs.previous()) {
				System.out.println(
						padR(rs.getString(1),rsmd.getColumnDisplaySize(1))+" "+
						padR(rs.getString(2),rsmd.getColumnDisplaySize(2))+" "+
						padR(rs.getString(3),rsmd.getColumnDisplaySize(3))+" "+
						padR(rs.getString(4),rsmd.getColumnDisplaySize(4))+" "+
						padR(rs.getString(5),rsmd.getColumnDisplaySize(5))+" "+
						padR(rs.getString(6),rsmd.getColumnDisplaySize(6))
				);
			}

			rs.absolute(4);
			rs.updateString(2, "Suraj Kumar");
			rs.updateRow();

			rs.beforeFirst();
			System.out.println("SCROLL-FORWARD");
			for(int i=1; i<=rsmd.getColumnCount(); i++) {
				System.out.print(padC(rsmd.getColumnLabel(i),rsmd.getColumnDisplaySize(i))+" ");
			}
			System.out.println();
			
			while(rs.next()) {
				System.out.println(
						padR(rs.getString(1),rsmd.getColumnDisplaySize(1))+" "+
						padR(rs.getString(2),rsmd.getColumnDisplaySize(2))+" "+
						padR(rs.getString(3),rsmd.getColumnDisplaySize(3))+" "+
						padR(rs.getString(4),rsmd.getColumnDisplaySize(4))+" "+
						padR(rs.getString(5),rsmd.getColumnDisplaySize(5))+" "+
						padR(rs.getString(6),rsmd.getColumnDisplaySize(6))
				);
			}

			rs.close();
			stmt.close();
			conn.close();
		} catch(ClassNotFoundException e) {
			System.out.println(e);
		} catch(SQLException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
	}

		private String padC(String data, int width) {
			StringBuffer buf = new StringBuffer(data);
			for(int i=data.length(); i<width; i++) {
				if(i%2==0) {
					buf.append(" ");
				} else {
					buf.insert(0," ");
				}
			}
			return buf.toString();
		}
		
		private String padR(String data, int width) {
			StringBuffer buf = new StringBuffer(data);
			for(int i=data.length(); i<width; i++) {
				buf.append(" ");
			}
			return buf.toString();
		}

	public static void main(String[] args) {
		new Scrollability();
	}

}
