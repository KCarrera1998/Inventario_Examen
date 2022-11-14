/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.umg.inventario_examen;

import java.sql.*;


/**
 *
 * @author alumno
 */
public class ConectarMYSQL {

    /**
     * @param args the command line arguments
     */
    public ConectarMYSQL(){
        
    }
    
    
    public String EjecutarComando (String textoSQL)
    {
    try
    {
        DriverManager.registerDriver (new com.mysql.jdbc.Driver ());
        Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost/alumno/","root","Umg$2019");
        Statement s = conexion.createStatement ();
        
        s.executeUpdate(textoSQL);
    }
    catch(Exception e)
    {
        e.printStackTrace();
        return "Operacion No Exitosa";
    }
    return "Operacion Exitosa";
    }
    public void mostrar(){
        
        }
    public void cerrar(){
        
    }
    public static void main(String[] args) 
    {
        new ConectarMYSQL();
    }
    
    
}
