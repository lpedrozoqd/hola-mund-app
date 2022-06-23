package edu.al.foundation.methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;


    
    public Empleado(String nombre, int edad, double salario) {
        super();
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
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
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean estaJubilado(){
        return this.getEdad() > 67;
    }

    public static void main(String[] args) {
        Empleado p1 = new Empleado("Leonel",43,9543000);
        Empleado p2 = new Empleado("Claudia",38,4500000);
        Empleado p3 = new Empleado("Rebeca",69,3000000);
        Empleado p4 = new Empleado("Angela",68,7000000);

        List<Empleado> listaEmpleados = Arrays.asList(p1,p2,p3,p4);

        /*
        Secuencia: Empleado->Filter(Lambda)->Map(Lambda)
        */

        List<Double> salariosEmpleados = listaEmpleados
            .stream()
            .filter(p -> p.getEdad() > 40)
            .map(p -> p.getSalario() * 0.70)
            .collect(Collectors.toList());
        System.out.println("==>Secuencia 1: Empleado->Filter(Lambda)->Map(Lambda)");
        salariosEmpleados.forEach(System.out::println);    
        
        System.out.println("======================");



        List<Double> salarioJubilados = listaEmpleados
            .stream()
            .filter(Empleado::estaJubilado)
            .map(Empleado::getSalario)
            .collect(Collectors.toList());
        
        salarioJubilados.forEach(System.out::println);
            


        



    }

}
