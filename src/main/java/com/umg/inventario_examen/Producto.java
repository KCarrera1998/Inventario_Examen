/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.inventario_examen;

/**
 *
 * @author alumno
 */
public class Producto extends ConectarMYSQL{
    int idproducto;
    String descripcion;
    
    public int getIDProducto(){
        return idproducto;
    }
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setIDProducto (int idproducto){
        this.idproducto=idproducto;
    }
    
    public void setDescripcion (String descripcion){
        this.descripcion=descripcion;
    }
    
    public Producto (int idproducto, String descripcion)
    {
        this.idproducto=idproducto;
        this.descripcion=descripcion;
    }
    public String Insertar()
    {
        String texto="INSERT INTO ProyectoInventario.producto (idproducto, descripcion) values ('campoText1', 'CampoText2')";
        return EjecutarComando (texto) ;
    }

}
