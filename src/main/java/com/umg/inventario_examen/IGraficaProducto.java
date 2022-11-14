/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.inventario_examen;

/**
 *
 * @author alumno
 */
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.JOptionPane;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author alumno
 */
public class IGraficaProducto extends JFrame {
    JButton b1;
    JLabel tag1;
    JLabel tag2;
    JTextField campoText1=new JTextField();
    JTextField campoText2=new JTextField();
    Producto producto;
    JPanel contenedor=new JPanel();
    
    public IGraficaProducto(String title) throws HeadlessExcept {
        super(title);
        this.setDefaultCloseOperation (EXIT_ON_CLOSE);
        //this. .setLocation (500, 200):
        this.setBounds (300, 300, 300, 300); //Definir Po
        this.setLocationRelativeTo (null);
        this.getContentPane().add(contenedor);
        this.contenedor.setBackground (Color. WHITE);
        contenedor.setLayout (null);
    }
    
    public void inicarCampos() {
        campoText1.setBounds(100, 20, 180, 30);
        this.contenedor.add(campoText1);
        
        campoText2.setBounds(100, 50, 180, 30);
        this.contenedor.add(campoText2);
    }
    
    private void inciarEtiquetas (){
        this.tag1=new JLabel ("ID Producto");
        this.contenedor.add(tag1);
        this.tag1.setForeground (Color.black) ;
        this.contenedor. setLayout (null);
        this.tag1.setBounds (13, 13, 165, 40);
        this.tag2=new JLabel ("Descripcion") ;
        this.contenedor.add (tag2);
        this.tag2.setForeground (Color .black) ;
        this.contenedor.setLayout (null);
        this.tag2.setBounds (13, 63, 165, 40);
        }
    
    public String iProducto ()
    {
        Producto pr=new Producto (campoText1.getText(), Integer, campoText2.getText(), String);
        return pr. Insertar();
    }
    
    public void iniciarbotones() {
        b1=new JButton("Guardar");
        contenedor.add(b1);
        contenedor.setLayout(null);
        b1.setBounds(40,200,100,30);
        b1.addActionListener(
            new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                JOptionPane.showMessageDialog (null, iProducto());
            }});
    }
}
