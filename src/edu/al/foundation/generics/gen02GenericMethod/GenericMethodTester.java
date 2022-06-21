package edu.al.foundation.generics.gen02GenericMethod;

public class GenericMethodTester {
    public static void main(String[] args) {
        Pair<Integer,String> p1 = new Pair<>(1,"apple");
        Pair<Integer,String> p2 = new Pair<>(1,"apple");
        boolean same = Utils.compare(p1, p2);
        System.out.println("p1 compre p2: " + same);
    }
}
