package jdbc;
import java.sql.*;
//import java.util.*;
public class DBConnect {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtest","root","1234");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from emp");
		while(rs.next())
		System.out.println(rs.getInt(1)+" "+rs.getString(1)+" "+rs.getString(1));
		con.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}
}
