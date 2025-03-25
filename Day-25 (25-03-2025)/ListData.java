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
				System.out.print(rsmd.getColumnLabel(i)+" ");
			}
			System.out.println();
			
			while(rs.next()) {
				System.out.println(
						rs.getInt("ID")+" "+
						rs.getString("NAME")+" "+
						rs.getString("SEX")+" "+
						rs.getString("PHONE")+" "+
						rs.getString("RELATIONSHIP")+" "+
						rs.getString("LOCATION")
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

	public static void main(String[] args) {
		new ListData();
	}
}
