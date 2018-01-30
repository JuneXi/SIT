package loginSystem;

import java.sql.*;
import java.sql.PreparedStatement;

public class Validate {
	public static boolean checkUser(User user){
		boolean res = false;
		try{
			Class.forName("come.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/index","root","studytonight");
			PreparedStatement ps = con.prepareStatement("select * from userInfo where name  = ? and password = ?");
			ps.setString(1, user.name);
			ps.setString(2, user.password);
			ResultSet rs = ps.executeQuery();
			res = rs.next();
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return res;
	}

}
