/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareagruposegundoparcial_modulo6;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public abstract class Persona {
     Scanner s = new Scanner(System.in);
    //declaracion de variables para polimorfismo y encapsulamiento 
     
       private  String datocadena;
       private int datonumerico;
       private int edad;
       private String nombre;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

       
      
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }


       
       
       
      
       
       
       
   //declaracion de constructor
    public Persona(String datocadena, int datonumerico, int edad, String nombre) {   
        this.datocadena = datocadena;
        this.datonumerico = datonumerico;
        this.edad = edad;
        this.nombre = nombre;
    }

    //declaracion de getter y setter
    public String getDatocadena() {
        return datocadena;
    }

    public void setDatocadena(String datocadena) {
        this.datocadena = datocadena;
    }

    public int getDatonumerico() {
        return datonumerico;
    }

    public void setDatonumerico(int datonumerico) {
        this.datonumerico = datonumerico;
    }

   
       
       
    //declaracion de metodos 
   
    public abstract void ingreso_datospersonales();
    public abstract void ingreso_datocadena();
    public abstract void ingreso_datonumerico();
    public abstract void muestrodatos();
    
}
