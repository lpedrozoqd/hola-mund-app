package edu.al.essential.exceptionsAll.catchingAndHandlingExceptions;

public class TheTryCatchSimpleTester {
    public static void main(String[] args) {
        int nums[] = new int[4];
        try {
            System.out.println("==> try/catch simple");
            //generar una excepción de índice fuera de límite
            nums[7] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Indice fuera de los límete");
        }
        System.out.println("Después de que se genere la excepción!");
    }
}
