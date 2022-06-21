package edu.al.estructuraDatos02;

public class Arreglos0102 {
    public static void main(String[] args) {
        Persona arregloPersonas[] = {
            new Persona("Leo",43), 
            new Persona("Claudia", 39),
            new Persona("Angela", 59),
            new Persona("Rebeca",16)};
        
        int edadMayor = EdadMayor0102.personaMayor(arregloPersonas);
        System.out.println("Edad mayor: " + edadMayor);
    }
}
