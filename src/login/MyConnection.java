package login;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import  java.sql.*;
/**
 *
 * @author Asus
 */
public class MyConnection {
    public static Connection getConnection(){
        
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/navy","root","sudeep");
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
         return con;
    }
   
    
    
}
