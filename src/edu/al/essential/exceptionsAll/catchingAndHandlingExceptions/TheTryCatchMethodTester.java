package edu.al.essential.exceptionsAll.catchingAndHandlingExceptions;

public class TheTryCatchMethodTester {
    static void generarExcepcion(){
        int nums[] = new int[4];
        System.out.println("==> método con problemas sin gestor de excepciones");
        nums[10] = 12;
        System.out.println("Esto no se mostrará");
    }

    public static void main(String[] args) {
        try {
            TheTryCatchMethodTester.generarExcepcion();    
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: límite fuera de lo asignado");
        }
        System.out.println("Finalización");
        
    }
}
