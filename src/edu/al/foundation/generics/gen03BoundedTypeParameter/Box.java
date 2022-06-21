package edu.al.foundation.generics.gen03BoundedTypeParameter;

public class Box<T> {

    private T t;

    public void set(T t){this.t = t;}
    public T get(){return this.t;}

    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.set(new Integer(10));
        integerBox.inspect(new Double(12.2));
        //integerBox.inspect("sadf");  //Error...no puede ser String

    }


}