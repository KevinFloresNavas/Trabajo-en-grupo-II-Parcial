/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareagruposegundoparcial_modulo6;

/**
 *
 * @author kevin
 */
public class Deportista extends Persona {
    
    public Deportista(String datocadena, int datonumerico, int edad, String nombre) {
        super(datocadena, datonumerico, edad, nombre);
    }

  //aqui hago referencia a la variable dato cadena como el deporte que practica la persona
    public void ingreso_datocadena() {
        System.out.println("Que deporte practicas: ");
        setDatocadena(s.nextLine());
    }

// aqui hago referencia a la variable dato numerico como el tiempo de expericia en el deporte
    public void ingreso_datonumerico() {
        System.out.println("Dime hace cuantos años lo practicas: ");
        setDatonumerico(s.nextInt());
    }
public void ingreso_datospersonales()
    {
        System.out.println("Ingrese su nombre: ");
        setNombre( s.nextLine());
        System.out.println("Ingrese su edad: ");
        setEdad(s.nextInt());
       
        
    }

    public void muestrodatos() {
        System.out.println("Nombre:-----------------"+getNombre());
        System.out.println("Edad:------------------ "+getEdad());
        System.out.println("Deporte:----------------"+getDatocadena());
        System.out.println("Experiencia:------------"+getDatonumerico()+" años");
    }
    
}
