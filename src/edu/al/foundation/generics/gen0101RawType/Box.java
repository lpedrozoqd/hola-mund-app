package edu.al.foundation.generics.gen0101RawType;

/*
Un 'raw type'  es el nombre de una clase o interfaz genérica 
sin 'argumentos de tipo'. Por ejemplo: ver clase de ejemplo 'BoxRawTypeTester'
*/
public class Box<T> {
    private T t;
    public void set(T t){this.t = t;}
    public T get() {return this.t;}

}
