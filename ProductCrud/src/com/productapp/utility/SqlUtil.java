package com.productapp.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


import java.sql.Statement;

public class SqlUtil {
	final static String Db_user="root";
	
	final static String db_password="cdac";
	final static String db_name="product";
	final static String db_url="jdbc:mysql://localhost:3306/"+db_name;
	final static String jdbc_driver="com.mysql.cj.jdbc.Driver";
	static Statement stmt;
	static Connection conn;
	
	static public void connectionDb() throws ClassNotFoundException, SQLException {
		Class.forName(jdbc_driver);
		DriverManager.getConnection(db_url,Db_user,db_password);
	stmt=conn.createStatement();
	
	}
 static public int insert (String qry) throws SQLException {
	int result=-1;
	if(qry!=" ") {
		stmt.executeUpdate(qry);
		
	}
	return result;
}
 static public ResultSet fetch(String qry) throws SQLException {
     ResultSet rs = null;
     if (conn != null && stmt != null && qry != null && !qry.trim().isEmpty()) {
         rs = stmt.executeQuery(qry); // Execute query and assign to rs
     }
     return rs;
 }

 static public void close() throws SQLException {
     if (conn != null) {
         stmt.close();
         conn.close(); // Close the connection
     }
 }
}