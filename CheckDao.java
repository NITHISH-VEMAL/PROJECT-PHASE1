package product1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CheckDao {
	
	
	String sql="select * from org where fcode=?";
	String url="jdbc:mysql://localhost:3306/nithish";
	String username="root";
	String password="vns_1998";
	
	
	
	public boolean check(int codee){
			
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			PreparedStatement st=con.prepareStatement(sql);
			st.setInt(1, codee);
			//st.setString(2, codee);
			
			
			
			
			ResultSet rs= st.executeQuery();	
			if(rs.next())
				return true;
			else
				return false;
			
			
		}
		catch(Exception e)
		{
			
		}
		return false;
		
	}
	
}