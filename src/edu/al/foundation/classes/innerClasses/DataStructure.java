package edu.al.foundation.classes.innerClasses;

import java.util.Iterator;

public class DataStructure {
    //Crea un array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure(){
        //Llena el array ascendente con valores entero
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void printEven(){
        //Imprime los valores de los índices pares:
        DataStructureIterator iter = this.new EvenIterartor();
        while(iter.hasNext()){
            System.out.println("Iter: " + iter.next());
        }
    }

    interface DataStructureIterator extends Iterator<Integer>{
        
    }

    private class EvenIterartor implements DataStructureIterator{

        private int nextIndex = 0;

        @Override
        public boolean hasNext() {
            //Verifica si el actual elemento es el último en el array
            return (nextIndex <= SIZE - 1);
        }

        @Override
        public Integer next() {
            //Registra un valor de un próximo indice par del array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            nextIndex += 2;
            return retValue;
        }
        
    }
    public static void main(String[] args) {
        System.out.println("=============================");
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}
