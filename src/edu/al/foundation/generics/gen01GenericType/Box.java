package edu.al.foundation.generics.gen01GenericType;

//Generic Version
public class Box<T> {
    //T quiere decir "type"
    private T t;

    public Box( T t){
        this.t = t;
    }
    
    public void set(T t){this.t = t;}
    public T get(){return this.t;}
}
