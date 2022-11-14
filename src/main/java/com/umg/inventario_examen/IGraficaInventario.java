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
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class IGraficaInventario extends JFrame {
    JButton b1;
    JButton b2;
    JLabel tag1;
    JLabel tag2;
    JLabel tag3;
    JLabel tag4;
    JLabel tag5;
    JLabel tag6;
    JLabel tag7;
    JLabel tag8;
    JTextField campoText1=new JTextField();
    JTextField campoText2=new JTextField();
    JTextField campoText3=new JTextField();
    JTextField campoText4=new JTextField();
    JTextField campoText5=new JTextField();
    JTextField campoText6=new JTextField();
    JTextField campoText7=new JTextField();
    JTextField campoText8=new JTextField();
    Inventario inventario;
    JPanel contenedor=new JPanel () ;
    
    public IGraficaInventario(String title) throws HeadlessExcept {
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
        
        campoText3.setBounds(100, 80, 180, 30);
        this.contenedor.add(campoText3);
        
        campoText4.setBounds(100, 110, 180, 30);
        this.contenedor.add(campoText4);
        
        campoText5.setBounds(100, 140, 180, 30);
        this.contenedor.add(campoText5);
        
        campoText6.setBounds(100, 170, 180, 30);
        this.contenedor.add(campoText6);
        
        campoText7.setBounds(100, 200, 180, 30);
        this.contenedor.add(campoText7);
        
        campoText8.setBounds(100, 230, 180, 30);
        this.contenedor.add(campoText8);
        
    }
    
    private void inciarEtiquetas (){
        this.tag1=new JLabel ("ID Inventario");
        this.contenedor.add(tag1);
        this.tag1.setForeground (Color.black) ;
        this.contenedor. setLayout (null);
        this.tag1.setBounds (13, 13, 165, 40);
        
        this.tag2=new JLabel ("Fecha Inicial") ;
        this.contenedor.add (tag2);
        this.tag2.setForeground (Color .black) ;
        this.contenedor.setLayout (null);
        this.tag2.setBounds (13, 63, 165, 40);
        
        this.tag3=new JLabel ("Fecha Final");
        this.contenedor.add(tag3);
        this.tag3.setForeground (Color.black) ;
        this.contenedor. setLayout (null);
        this.tag3.setBounds (13, 113, 165, 40);
        
        this.tag4=new JLabel ("Stock Inicial") ;
        this.contenedor.add (tag4);
        this.tag4.setForeground (Color .black) ;
        this.contenedor.setLayout (null);
        this.tag4.setBounds (13, 163, 165, 40);
        
        this.tag5=new JLabel ("Entradas");
        this.contenedor.add(tag5);
        this.tag5.setForeground (Color.black) ;
        this.contenedor. setLayout (null);
        this.tag5.setBounds (13, 213, 165, 40);
        
        this.tag6=new JLabel ("Salidas") ;
        this.contenedor.add (tag6);
        this.tag6.setForeground (Color .black) ;
        this.contenedor.setLayout (null);
        this.tag6.setBounds (13, 263, 165, 40);
        
        this.tag7=new JLabel ("Total Inventario");
        this.contenedor.add(tag7);
        this.tag7.setForeground (Color.black) ;
        this.contenedor. setLayout (null);
        this.tag7.setBounds (13, 313, 165, 40);
        
        this.tag8=new JLabel ("ID Producto") ;
        this.contenedor.add (tag8);
        this.tag8.setForeground (Color .black) ;
        this.contenedor.setLayout (null);
        this.tag8.setBounds (13, 363, 165, 40);
        }
    
    public String iInventario ()
    {
        Inventario in=new Producto (campoText1.getText(), Integer, campoText2.getText(), String, campoText3.getText(), String, campoText4.getText(), Integer, campoText5.getText(), Integer, campoText6.getText(), Integer, campoText7.getText(), Integer, campoText8.getText(), Integer);
        return in. Insertar();
    }
    
    public void iniciarbotones() {
        b1=new JButton("Guardar");
        contenedor.add(b1);
        contenedor.setLayout(null);
        b1.setBounds(40,200,100,30);
        b1.addActionListener(
            new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                JOptionPane.showMessageDialog (null, iInventario());
            }});
    }
}
