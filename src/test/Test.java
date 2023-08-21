
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
    
    

                       String query = "UPDATE `test` SET `Qty`= `Qty`-'3' WHERE `Id`='5'";
                        DB.push(query);
    
    
}

}
