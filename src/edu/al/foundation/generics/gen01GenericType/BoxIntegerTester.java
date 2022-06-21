package edu.al.foundation.generics.gen01GenericType;

public class BoxIntegerTester {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(2);
        System.out.println("Valor: " + box.get());

    }
}
