package edu.al.foundation.generics.gen0301GenericMethodBoundedTypeParameter;

public class ComparableAccion {
    
    public static <T extends Comparable<T>> int contadorMasGrande(T[] arregloDatos, T elemento){
        
        int count = 0;
        
        for (T e : arregloDatos){
            System.out.println("Elemento del arreglo: " + e);    
            int res = e.compareTo(elemento);
            System.out.println("compare eval: " + res);
            if ( res > 0){
                ++count;
            }
        }
        return count;
    }

 
    public static void main(String[] args) {
        Integer[] marks = new Integer[] {12,0,15,18,4,10};
        int aComparar = 10;
        int av = ComparableAccion.contadorMasGrande(marks, aComparar);
        System.out.println("Número de veces otros n+umeros más grande que: " + aComparar + " es: " + av );
    }
}
