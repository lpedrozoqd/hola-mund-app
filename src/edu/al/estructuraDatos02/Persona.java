package edu.al.estructuraDatos02;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombreArg, int edadArg){
        nombre = nombreArg;
        edad = edadArg;
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

    
}
