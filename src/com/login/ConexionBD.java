package com.login;

import java.sql.*;

public class ConexionBD {
    Connection cn;
    
    public Connection conexion(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://localhost/car","root","");
        System.out.println("conexion exitosa");
        }catch(Exception e){
            System.out.println(e.getMessage());
        } return cn;
    }
    
    Statement createStatement(){
        throw new UnsupportedOperationException("No soportado");
    }
}
