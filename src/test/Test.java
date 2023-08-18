
package test;

import java.sql.Connection;
import java.sql.ResultSet;


import java.sql.SQLException;
import javax.swing.JOptionPane;
import v.DB.DB;


/**
 *
 * @author Administrator
 */
public class Test {
public static void main(String[] args) throws SQLException, Exception {
 Connection con = DB.getDBConnection();
 if(con != null){
     System.out.println("Success");
 }
    
    
    ResultSet rs = con.createStatement().executeQuery("SELECT * FROM Customer"); 

        System.out.println(rs.getString("LName"));
    
    
}

}
