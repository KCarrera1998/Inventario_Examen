/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.inventario_examen;

/**
 *
 * @author alumno
 */
public class Inventario extends ConectarMYSQL{
    int idinventario, stockinicial, entradas, salidas, total, idprod;
    String fechainicial, fechafinal;
    
    
    public int getIDInventario(){
        return idinventario;
    }
    public String getFechaInicial (){
        return fechainicial;
    }
    public String getFechaFinal (){
        return fechafinal;
    }
    public int getStockInicial (){
        return stockinicial;
    }
    public int getEntradas (){
        return entradas;
    }
    public int getSalidas (){
        return salidas;
    }
    
    
    
    
    public void setIDInventario (int idinventario){
        this.idinventario=idinventario;
    }
    public void setFechaInical (String fechainicial){
        this.fechainicial=fechainicial;
    }
    public void setFechaFinal (String fechafinal){
        this.fechafinal=fechafinal;
    }
    public void setStockInicial (int stockinicial){
        this.stockinicial=stockinicial;
    }
    public void setEntradas (int entradas){
        this.entradas=entradas;
    }
    public void setSalidas (int salidas){
        this.salidas=salidas;
    }
    
    
    public Inventario (int idinventario, String fechainicial, String fechafinal, int stockinicial, int entradas, int salidas)
    {
        this.idinventario=idinventario;
        this.fechafinal=fechainicial;
        this.stockinicial=stockinicial;
        this.entradas=entradas;
        this.salidas=salidas;
    }
    public String Insertar()
    {
        String texto="INSERT INTO ProyectoInventario.Inventario (idinventario, fehcainical, fechafinal, stockinicial, entradas, salidas) values (campoText1, 'campoText2', 'campoText3', campoText4, campoText5, Campotext6)";
        return EjecutarComando(texto);
    }
}
