package micro.mini.projet;


import java.sql.*;

import javax.swing.JOptionPane;


public class MyConnection {
	
	Connection con = null; 
	public static Connection connect()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/cabinetMedical", "root", "");
			return con ;
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
	
}
