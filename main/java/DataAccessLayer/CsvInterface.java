/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer;

/**
 *
 * @author JSI-Christine
 */
import entities.*;
import java.util.List;

public interface CsvInterface {
    
    public void save (CsvInfo p);
    
    public List<CsvInfo> findAll();
    
    public void update (CsvInfo p);
    
    public void delete (CsvInfo p);
    
}
