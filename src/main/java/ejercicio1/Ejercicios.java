/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author JOSAFAT
 */
//importamos las siguientes librerias
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


 /**
     * Realizar un programa en Java que al presionar un botón pueda insertar una imagen de fondo a un JLabel.
     */

public class Ejercicios {

    public static void main(String[] args) {
       marcoBoton mimarco = new marcoBoton(); //instanciamos uso de constructor para la ventana
       mimarco.setVisible(true);//hacer visible el contructoro para que nos muestre la ventana
       
    }
}
     class marcoBoton extends JFrame{
         //creamos nuestro constructor
        public marcoBoton(){
            setTitle("INSERTAR UNA IMAGEN");//titulo de la ventana	
			//setSize(390, 580); //tamaño de la ventana
                        //setLocation(390, 180);//posicion dela ventana
                        setBounds(290, 150,650,650);//posicion y tamaño de la ventana
			setResizable(false);//para poder maximizar o minimizar la ventana
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//para cerrar la ventana
                        milaminaBoton milam= new milaminaBoton();
                        add(milam);
                        
        }
     }
     
     class milaminaBoton extends JPanel implements ActionListener{
        JButton boton1; //declarams el nombre del componente jButton en boton1
      JLabel imagen; //declaramos el nombre del componente Jlabel
       //creamos nuestro constructor
        public milaminaBoton(){
            setLayout(null);//se encarga de poner todo los componentes en la posicion correspondiente, para que no se ajusta automaticamente   
            boton1=new JButton("Mostrar la imagen");//el titulo que va llevar el boton que mostrara en la pantalla 
		boton1.setBounds(250,50,150,30);//posicion y tamaño del boton
		add(boton1);//Agregamos el boton ala pantalla o al panel
		boton1.addActionListener(this);
       }
        //creamos el metodo de accion para el evento del boton
        public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton1) {//el acceso al método getSource() capturar el origen del evento del boton 1
                    setBackground(Color.red);//color de fondo
                    setLayout(null);//se encarga de poner todo los componentes en la posicion correspondiente, para que no se ajusta automaticamente
                    imagen= new JLabel();
                        add(imagen);//usamos el metodo add para agregar la imagen ala pantalla
                        
                        imagen.setIcon(new ImageIcon("src/15011.gif"));// agregamos la ubicacion de la imagen
                        imagen.setBounds(50,150,550,310); //posicion y tamaño de la imagen
		}
	}
     
}