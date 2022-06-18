package edu.al.foundation.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorSample {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Suzuki");
        cars.add("Volvo");
        cars.add("Toyota");
        cars.add("Honda");

        Iterator<String> iter = cars.iterator();

        //Imprime el primer elemento:
        System.out.println("1er. elemento: " + iter.next());

        //Itera sobre el resto de la collección
        while(iter.hasNext() ){
            System.out.println("elemento: " + iter.next());
        }


        
    }
}
