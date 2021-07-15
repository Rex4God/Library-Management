/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AGAMUYI PRECIOUS
 */



import java .sql.*;
import javax.swing.JOptionPane;
public class JavaConnection {
  Connection conn = null;
  
  
 public static Connection ConnectDb(){
     
    try{
     Class.forName("org.sqlite.JDBC");
   
Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Library Management System\\Library Management System.sqlite");
     
   return conn;
        
    }catch(Exception  e){
        
        JOptionPane.showMessageDialog(null, e);
    }
     
     
     
  return null;    
 } 
  
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
 
  
  
  
  

