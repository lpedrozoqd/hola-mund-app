package edu.al.estructuraDatos01;

import java.util.Scanner;

public class MemoriaEstatica {
    public static void main(String[] args) {
        int arrayNumeros[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int num;
        int i = 0;
        do{
            System.out.println("Ingrese un número:");
            num = sc.nextInt();
            arrayNumeros[i] = num;
            i++;
            if (i==10)break;
        }while (num > 0);

    }
}
