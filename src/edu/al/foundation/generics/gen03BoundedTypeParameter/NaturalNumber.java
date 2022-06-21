package edu.al.foundation.generics.gen03BoundedTypeParameter;

public class NaturalNumber<T extends Integer> {
    private T n;

    public NaturalNumber(T n){
        this.n = n;
    }

    public boolean isEven(){
        return n.intValue() % 2 == 0;
    }

    public static void main(String[] args) {
        NaturalNumber<Integer> natNum = new NaturalNumber<Integer>(23);
        System.out.println("isEven ? " + natNum.isEven());


    }

}
