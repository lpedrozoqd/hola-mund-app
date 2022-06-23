package edu.al.essential.exceptionsAll.catchingAndHandlingExceptions;

import java.io.IOException;

public class ThrowsTester {
    public static char prompt(String args) throws IOException{
        System.out.println(args + " :");
        return (char)System.in.read();
    }

    public static void main(String[] args) {
        char ch;
        try {
            //Dado que prompt() podría arrojar una excepción,
            //una llamada debe incluirse dentro de un bloque try
            ch = prompt("Ingresar una letra");
            
            
        } catch (IOException e) {
            System.out.println("Ocurrió una excepción de E/S");
            ch = 'X';
        }
        System.out.println("Usted presionó: " + ch);

    }
}
