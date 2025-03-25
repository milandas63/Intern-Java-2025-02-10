package com.jdbc;

import java.sql.*;

public class ListData {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private ResultSetMetaData rsmd;

	public ListData() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/barshita", "root", "root");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT c.con_id AS 'ID',c.con_name AS 'NAME',c.gender AS 'SEX',c.mobile_no AS 'PHONE',r.rel_desc AS 'RELATIONSHIP',l.loc_desc AS 'LOCATION' FROM contact AS c LEFT JOIN relation AS r ON r.rel_id=c.con_id LEFT JOIN location AS l ON l.loc_id=c.loc_id");
			rsmd = rs.getMetaData();
			//System.out.println(rs.isBeforeFirst()+" "+rs.isAfterLast());
			//System.out.println(rs.getInt("ID"));

			
			for(int i=1; i<=rsmd.getColumnCount(); i++) {
				System.out.print(padC(rsmd.getColumnLabel(i),rsmd.getColumnDisplaySize(i))+" ");
			}
			System.out.println();
			
			while(rs.next()) {
				System.out.println(
						padR(rs.getString("ID"),rsmd.getColumnDisplaySize(1))+" "+
						padR(rs.getString("NAME"),rsmd.getColumnDisplaySize(2))+" "+
						padR(rs.getString("SEX"),rsmd.getColumnDisplaySize(3))+" "+
						padR(rs.getString("PHONE"),rsmd.getColumnDisplaySize(4))+" "+
						padR(rs.getString("RELATIONSHIP"),rsmd.getColumnDisplaySize(5))+" "+
						padR(rs.getString("LOCATION"),rsmd.getColumnDisplaySize(6))
				);
			}

			rs.close();
			stmt.close();
			conn.close();
		} catch(ClassNotFoundException e) {
		} catch(SQLException e) {
		} catch(Exception e) {
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
		new ListData();
	}
}
