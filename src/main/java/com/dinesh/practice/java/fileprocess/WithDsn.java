package com.dinesh.practice.java.fileprocess;
import java.sql.*;
public class WithDsn {

	public static void main(String[] args) {
      try {
    	String url="jdbc:odbc:mydsn";
    	Class.forName("sun.jdbc.odbc.Jdbc.OdbcDriver");
    	Connection c=DriverManager.getConnection(url);
    	Statement st=c.createStatement();
    	ResultSet rs=st.executeQuery("select * from login");
    	 while(rs.next()) {
    		 System.out.println(rs.getString(1));
    	 }
      }
      catch(Exception ee) {
    	  System.out.println(ee);
      }
		
	}

}
