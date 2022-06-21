package edu.al.foundation.generics.gen01GenericType;

public class OrderPairTest {
    public static void main(String[] args) {
        OrderPair<String,Integer> p1 = new OrderPair<>("Even",8);
        OrderPair<String,Integer> p2 = new OrderPair<>("Ruth",18);
        System.out.println("===>Usando OrderPair(String,Integer)");
        System.out.println("p1.key: "+ p1.getKey() + " p1.value: " + p1.getValue());
        System.out.println("p2.key: "+ p2.getKey() + " p2.value: " + p2.getValue());
        
        System.out.println("====================");
        
        System.out.println("===>Usando OrderPair(String,Box<Integer>)");
        OrderPair<String,Box<Integer>> p11 = new OrderPair<>("Brasilia",new Box<Integer>(1234));
        OrderPair<String,Box<Integer>> p12 = new OrderPair<>("Copetrán",new Box<Integer>(5678));
        System.out.println("p11.geKey: " + p11.getKey());
        System.out.println("p11.getValue().get(): " + p11.getValue().get());
        System.out.println("p12.geKey: " + p12.getKey());
        System.out.println("p12.getValue().get(): " + p12.getValue().get());



    }
}
