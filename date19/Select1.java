package date19;

import java.sql.*;

public class Select1
{

	public static void main(String[] args)
	{
		 Connection con = null;
	     Statement st = null;
	     ResultSet rs = null;

	     String url = "jdbc:mysql://localhost:3306/world";
	     String user = "root";
	     String password = "";

	        try {
	            
	            con = DriverManager.getConnection(url, user, password);
	            st = con.createStatement();
	            rs = st.executeQuery("SELECT * from city");

	            while (rs.next()) {
	                
	                System.out.print(rs.getInt(1) + "\t");
	                System.out.println(rs.getString(2));
	            }

	        } catch (SQLException ex) {
	        
	            ex.printStackTrace();

	        } finally {
	            
	            try {
	                
	                if (rs != null) {
	                    rs.close();
	                }
	                
	                if (st != null) {
	                    st.close();
	                }
	                
	                if (con != null) {
	                    con.close();
	                }

	            } catch (SQLException ex) {
	                
	                ex.printStackTrace();
	            }
	        }

	}

}
