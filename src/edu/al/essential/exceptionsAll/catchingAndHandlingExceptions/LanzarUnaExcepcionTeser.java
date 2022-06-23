package edu.al.essential.exceptionsAll.catchingAndHandlingExceptions;

public class LanzarUnaExcepcionTeser {
    public static void main(String[] args) {
        try {
            System.out.println("Antes de lanzar la excepción aritmética...");
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            //Capturando al exepción
            System.out.println("Excepción capturada!");
        }
        System.out.println("Después del boque de try/catch");
    }
}
