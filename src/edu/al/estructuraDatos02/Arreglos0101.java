package edu.al.estructuraDatos02;

public class Arreglos0101 {
    public static void main(String[] args) {
        //Aquí definimos la referencia del arreglo a la memoria
        //int miArreglo[];

        //Opción 1: aquí defino el tamaño
        //miArreglo = new int[5];

        //Opción 2: aquí asigno de una vez los valores
        int miArreglo[] = {1,2,4,5,6};

        System.out.println("Posición: " + miArreglo[4]);

        for(int i=0; i < miArreglo.length; i++){
            if(miArreglo[i] == 4){
                System.out.println("El íem '4' en la posición: " + i);
            }
        }
    }
}
