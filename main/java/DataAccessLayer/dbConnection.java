/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer;

import entities.CsvInfo;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author JSI-Christine
 */
public class dbConnection {   
  
  
    public static Connection getConnection(){       
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/csvinfo","root","");
            return con;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
}
