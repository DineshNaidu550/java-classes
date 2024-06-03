package com.dinesh.practice.java.fileprocess;
import java.sql.*;
public class WithOutDSN {

	public static void main(String[] args) {
 
		try {
			String database="student.mdb";
			String url ="jdbc:odbc:Driver={Microsoft Access Driver(*.mdb)};"
					+ "DBQ="+database+";DriverID=22;READONLtrue";
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection c=DriverManager.getConnection(url);
		Statement st=c.createStatement();
     	ResultSet rs=st.executeQuery("select*from login");
     	while(rs.next()) {
     		System.out.print(rs.getString(1));
     	}
		}
		catch(Exception ee) {
		System.out.println(ee);
	}

}
}