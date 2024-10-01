package com.Jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//import com.mysql.cj.xdevapi.Statement;
//
//public class JDBCExample {
//	
//	public static void main(String [] args) throws ClassNotFoundException, 
//
//	
//	
//	
//	
//	
//	
//	{
//		
//		
//		   
//		    	   	Class.forName("com.mysql.cj.jdbc.Driver");
//		    	   	Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","cdac");
//		    	  PreparedStatement ps = 	 conn.prepareStatement("insert into products values('1','keyboard','1200')");
//		    	   	int i =ps.executeUpdate();
//		    	   	if(i>0) 
//		    	   	{
//		    	   		System.out.println("success");
//		    	   		
//		    	   	}
//		    	   	else {
//		    	   		System.out.println("fail");
//		    	   	}
//		    	   	 
//	}
//}
//
public class JDBCExample{
	public  static void main(String [] args) throws SQLException, ClassNotFoundException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product id:");
		String productId=sc.nextLine();
		
		System.out.println("enter product name:");
		String productName=sc.nextLine();
		
		System.out.println("enter product price:");
		String productPrice=sc.nextLine();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn= DriverManager.getConnection("jdbc.mysql://localhost:3306/product", "root", "cdac");
		PreparedStatement ps = conn.prepareStatement(" Insert into products Values(?,?,?)");
		ps.setString(1, productPrice);
		ps.setString(2, productName);
		ps.setString(3, productPrice);
		
		int i= ps.executeUpdate();
		if(i>0) {
			System.out.println("success");
			
		}
		else { System.out.println("Fail");
    
		}
    sc.close();
    conn.close();
}

}
