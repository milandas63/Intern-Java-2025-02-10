package com.jdbc;

// Step-1 Import java.sql package
import java.sql.*;

public class Connectivity {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	public Connectivity() {
		try {
			// Step-2 Load and Register Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//  Step-3 Create Connection Object
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/barshita", "root", "root");
			
			// Step-4 Create Statement Object
			stmt = conn.createStatement();
			
			// Step-5 Create ResultSet Object
			rs = stmt.executeQuery("SELECT c.con_id AS 'ID',c.con_name AS 'NAME',c.gender AS 'SEX',c.mobile_no AS 'PHONE',r.rel_desc AS 'RELATIONSHIP',l.loc_desc AS 'LOCATION' FROM contact AS c LEFT JOIN relation AS r ON r.rel_id=c.con_id LEFT JOIN location AS l ON l.loc_id=c.loc_id");

			// Step-6 Manipulate ResultSet
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
			
			//	Step-7 Close ResultSet, Statement & Connection
			rs.close();
			stmt.close();
			conn.close();
		} catch(ClassNotFoundException e) {
		} catch(SQLException e) {
		} catch(Exception e) {
		}
		
	}

	public static void main(String[] args) {
		new Connectivity();
	}

}
