package edu.al.estructuraDatos02;

public class EdadMayor0102 {

   public static int personaMayor(Persona[] arregloPersonas){
       int edadMayor = arregloPersonas[0].getEdad();
       for (int i = 1; i < arregloPersonas.length; i++){
           if (arregloPersonas[i].getEdad() > edadMayor){
               edadMayor = arregloPersonas[i].getEdad();
           }
       }
       return edadMayor;
   }
}
