package edu.al.foundation.ComparableInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Persona implements Comparable<Persona>{

    private String nombre;
    private int edad;

        

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getEdad() {
        return edad;
    }



    public void setEdad(int edad) {
        this.edad = edad;
    }



    @Override
    public int compareTo(Persona o) {
        if (this.getEdad() > o.getEdad()){
            return 1;
        }else
            if (this.getEdad() < o.getEdad()){
                return -1;
            }else{
                return 0;
            }
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("Leo",43);
        Persona p2 = new Persona("Claudia",39);
        Persona p3 = new Persona("Angela",6);
        Persona p4 = new Persona("Neco",12);

        List<Persona> personas = new ArrayList<Persona>();
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);

        Collections.sort(personas);

        for (Persona p : personas){
            System.out.println("Nombre: " + p.getNombre() + " edad: " + p.getEdad());
        }
    }



    
}
