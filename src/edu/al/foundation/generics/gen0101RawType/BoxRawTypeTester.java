package edu.al.foundation.generics.gen0101RawType;

public class BoxRawTypeTester {
    public static void main(String[] args) {
        //No tiene 'tipo de argumento' y es válido
        Box rawBox = new Box();

        //Esto se usa más que todo para las versiones de colecciones que
        //no usan 'generics' (código legacy)
        Box<String> stringBox = new Box<>();
        rawBox = stringBox;  //Ok
        stringBox.set("Ocho!");
        System.out.println("Valor: " +  stringBox.get());




        
    }
}
