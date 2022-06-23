package edu.al.essential.exceptionsAll.catchingAndHandlingExceptions;

public class TheTryCatchAnidadoTester {

    public static void main(String[] args) {
        //Aquí, num es más grande que denom
        int nums[]={4,8,16,32,64,128,256,512};
        int denom[]={2,0,4,4,0,8};
        try { //try externo
            for (int i = 0; i < nums.length; i++) {
                //try anidado
                try { 
                    System.out.println(nums[i] + " / " +  denom[i] + " es " + nums[i] / denom[i]);
                } catch (ArithmeticException exc) {
                    //Capturando la excepción
                    System.out.println("No se puede dividir por cero!");
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException exc) {
                    //Capturando la excepción
                    System.out.println("Alguna excepción ocurrió.");
                    System.out.println("ERROR: Programa terminado.");
        }
    }
}
