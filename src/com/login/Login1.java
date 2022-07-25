
package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Login1 {

Connection conectar=null;
public Connection login(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        conectar=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/car","root","");
      System.out.println("conexion exitosa");
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"Error de conexion de la base de datos");
    }catch(ClassNotFoundException ex){    
    }
    return conectar;
}   
}
