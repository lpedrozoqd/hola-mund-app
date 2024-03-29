package edu.al.foundation.generics.gen0401WildcardsUpperBounded;

import java.util.Arrays;
import java.util.List;

public class WildcardsUpperBoundetTester {
    public static double sumOfList(List<? extends Number> list){
        double s = 0.0;
        for (Number n : list){
            s += n.doubleValue();
        }
        return s;
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3);
        System.out.println("Res Integer: " + WildcardsUpperBoundetTester.sumOfList(li));

        List<Double> ld = Arrays.asList(1.4,2.2,3.3);
        System.out.println("Res Double: " + WildcardsUpperBoundetTester.sumOfList(ld));
        
    }
}
