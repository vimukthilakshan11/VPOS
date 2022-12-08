/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Vimukthi Lakshan
 */
public class DB {
    
         static Connection con;
    private static void Init_DB() throws ClassNotFoundException, SQLException{
    
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/v-solution","root","");
    
    }
    
    public static void push(String sql)throws Exception{
    if(con == null){
    Init_DB();
    }
    
    con.createStatement().executeUpdate(sql);
    }
    
    public static ResultSet search(String sql)throws Exception{
    if(con== null){
    Init_DB();
    }
    return con.createStatement().executeQuery(sql); 
    }
     public static Connection getDBConnection()throws Exception{
        if (con == null) {
            Init_DB();
        }
        return con;
    }
}
