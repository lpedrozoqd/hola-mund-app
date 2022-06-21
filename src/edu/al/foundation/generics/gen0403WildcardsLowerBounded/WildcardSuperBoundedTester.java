package edu.al.foundation.generics.gen0403WildcardsLowerBounded;

import java.util.ArrayList;
import java.util.List;

public class WildcardSuperBoundedTester {
    public static void addNumbers(List<? super Integer> listNumbers){
     for (int index = 0; index < 9; index++) {
         listNumbers.add(index);
     }
    }
    
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        WildcardSuperBoundedTester.addNumbers(list);
        for (Integer iterable_element : list) {
            System.out.println(iterable_element);
        }
    }
}
