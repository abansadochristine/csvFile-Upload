/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csvuploaderapp;

/**
 *
 * @author JSI-Christine
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;  // Import the File class
import javax.swing.filechooser.FileNameExtensionFilter;
import entities.*;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;
import DataAccessLayer.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
public class home implements ActionListener{
    
    private JTextField tf;
    private JTable table;
    private JButton open;
    private JButton upload;
    private JButton cancel;
    private FileReader filename;
    private String excelPath = "";
    CsvDAO loCsvDao = new CsvDAO();
    
    public home (){
        
        //Creating the Frame
        JFrame frame = new JFrame("Upload CSV File");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Open File");
        JMenuItem m22 = new JMenuItem("Exit");
        m1.add(m11);
        m1.add(m22);
        table = new JTable();
       
        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        panel.add(table);
        JLabel label = new JLabel("File Path");
        tf = new JTextField(20); // accepts upto 10 characters
        open = new JButton("Open File");         
        upload = new JButton("Upload File");     
        cancel = new JButton("Upload File");
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(open);
        panel.add(upload);
        panel.add(cancel);
        // Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.setVisible(true);       
                        
        open.addActionListener((ActionListener) this);
        upload.addActionListener((ActionListener) this);
        cancel.addActionListener((ActionListener) this);
    }    
    public static void main(String args[]){
        
        home h = new home();  
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {      
        // this section when the user click open button
        if (e.getSource() == open)
        {
          JFileChooser jf = new JFileChooser();
          FileNameExtensionFilter fil = new FileNameExtensionFilter("files","csv","xls");
          jf.setDialogTitle("Please select a excel file to import");
          jf.setFileFilter(fil);
          int result =jf.showOpenDialog(null);
          if(result == JFileChooser.APPROVE_OPTION)
          {
              excelPath = jf.getSelectedFile().getAbsolutePath();
              tf.setText(excelPath); 
          }
        }
         // this is when the user click Upload button
        else if (e.getSource() == upload)
        {
           List<CsvInfo> csvList = getCsvDetails(excelPath);
            csvList.forEach(csv -> {
                loCsvDao.save(csv);
            });          
        }
         // this is when the user click cancel button
        else if (e.getSource() == cancel)
        {
           
        }
    }    
    private static  List<CsvInfo> getCsvDetails(String file){
       List<CsvInfo> csvList = null;
       Path pathFile = Paths.get(file);
       try(BufferedReader br = Files.newBufferedReader(pathFile)){
           String row = br.readLine();
           while(row != null){
            String [] attributes = row.split(",");
            CsvInfo csv = getCsvInfo(attributes);
            csvList.add(csv);
           }           
       }catch (IOException e){
        e.printStackTrace();   
       }
       return csvList;
    }
    
    private static  CsvInfo getCsvInfo(String[] attributes){
        String a = attributes[0] ;
        String b = attributes[1] ;
        String c = attributes[2] ;
        String d = attributes[3] ;
        String e = attributes[4] ;
        String f = attributes[5] ;
        String g = attributes[6] ;
        String h = attributes[7] ;
        String i = attributes[8] ;
        String j = attributes[9] ;   
        CsvInfo csv = new CsvInfo(a,b,c,d,e,f,g,h,i,j);
        
        return csv;
    }
  
}