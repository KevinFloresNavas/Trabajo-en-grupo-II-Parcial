/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareagruposegundoparcial_modulo6;

import java.util.Scanner;

/**
 *
 * @author Joseph
 */
public class TareaGrupoSegundoParcial_Modulo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner s = new Scanner(System.in);
  
        System.out.println("ESTUDIANTE");
    
    Doctor e= new Doctor ("default",0,0,"default");
    e.ingreso_datospersonales();
    e.ingreso_datocadena();
    e.ingreso_datonumerico();
    e.muestrodatos();
    
        System.out.println("");
        System.out.println("");
        System.out.println("DEPORTISTAS");
    Deportista d= new Deportista("default",0,0,"default");
    d.ingreso_datospersonales();
    d.ingreso_datocadena();
    d.ingreso_datonumerico();
    d.muestrodatos();
        
    }
    
}
