import java.sql.*;
public class TableCreation {
	public static void main(String[] args)throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","supriya","supriya");
	    PreparedStatement pstmt=con.prepareStatement("create table Movies(Name varchar2(50),Hero_Name varchar2(50),Heroin_Name varchar2(50),year varchar2(30),director_name varchar(30))");
	    pstmt.executeUpdate();
	    con.close();
	}

}
