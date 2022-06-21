package edu.al.foundation.generics.gen0402WildcardsUnbounded;

import java.util.Arrays;
import java.util.List;

public class WildcardsUnboundedTester {
    public static void printList(List<?> list){
        for(Object elem : list ){
            System.out.println("Item: " + elem);
        }
    }

    public static void main(String[] args) {
       List<Integer> li = Arrays.asList(1,2,3);
       List<String> ls = Arrays.asList("one","two","three");
       WildcardsUnboundedTester.printList(li);
       System.out.println("=============================");
       WildcardsUnboundedTester.printList(ls);
    }
    
}
