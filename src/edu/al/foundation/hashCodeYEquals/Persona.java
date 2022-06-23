package edu.al.foundation.hashCodeYEquals;

public class Persona {
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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + edad;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (edad != other.edad)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("Leonel",43);
        Persona p2 = new Persona("Leonel",39);

        System.out.println("==> Hascode y equals");
        System.out.println(">> p1.hasCode(): " +  p1.hashCode());
        System.out.println(">> p2.hasCode(): " +  p2.hashCode());

        //La comparación de objetos es en su orden:
        //'hasCode' y luego 'equals'

        System.out.println("==> Verificando si los objetos son iguales");
        if (p1.equals(p2))
            System.out.println("p1 y p2 SON iguales");
        else
            System.out.println("p1 y p2 NO son iguales");

        System.out.println("==> Verificando si propieades de objetos son iguales");
        if (p1.getNombre().equals(p2.getNombre()))
            System.out.println("p1 y p2 SON en getNombre() iguales");
        else
            System.out.println("p1 y p2 NO son en getNombre() iguales");

        

    }
    
}
