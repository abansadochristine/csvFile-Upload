/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer;

import entities.CsvInfo;
import java.sql.Connection;
import java.sql.*;
import java.util.List;


/**
 *
 * @author JSI-Christine
 */
public class CsvDAO implements CsvInterface{
    
    Connection con;
    
    public CsvDAO(CsvInfo info){
        con=(Connection) dbConnection.getConnection();
        
    }

    public CsvDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // this is for inserting data
    @Override
    public void save(CsvInfo csv) {
        try{
        String sql = "insert into csvinfo(a,b,c,d,e,f,j,h,i,j) Values (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps= con.prepareStatement(sql);
        ps.setString(1, csv.getA());
        ps.setString(2, csv.getB());
        ps.setString(3, csv.getC());
        ps.setString(4, csv.getD());
        ps.setString(5, csv.getE());
        ps.setString(6, csv.getF());
        ps.setString(7, csv.getG());
        ps.setString(8, csv.getH());
        ps.setString(9, csv.getI());
        ps.setString(10, csv.getJ());
        ps.executeUpdate();
        }
        catch(SQLException ex){
            
        }
    }

    @Override
    public List<CsvInfo> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(CsvInfo p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(CsvInfo p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // this class for database connection   
    
}
