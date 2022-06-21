package edu.al.foundation.collectos;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Collectos es para tranformar en un stream a otro tipo de estructura
*/
public class Libro {
    private String titulo;
    private int paginas;

    public Libro(String titulo, int paginas) {
        super();
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public static void main(String[] args) {
        Libro l1 = new Libro("El serñor de los anillos",1000);
        Libro l2 = new Libro("Cien años de soledad",500);
        Libro l3 = new Libro("El cadiz de fuego",600);
        Libro l4 = new Libro("El ser mñor de los anillos",1000);
        

        //Se toma un 'Stream' y se añaden para recorrerlo, etc
        Stream<Libro> st  = Stream.of(l1,l2,l3);
        Stream<Libro> st2 =  Stream.of(l1,l2,l3);
        Stream<Libro> st3 =  Stream.of(l1,l2,l3);
        Stream<Libro> st4 =  Stream.of(l1,l2,l3,l4);
        Stream<Libro> st5 =  Stream.of(l1,l2,l3);
        Stream<Libro> st6 =  Stream.of(l1,l2,l3);

        st.forEach(l->System.out.println(l.getTitulo()));
        
        System.out.println("======================");
        
        //Opción 1: es enviarlo a una estructura
        Libro[] arrayLibro = st2.toArray(Libro[]::new);
        for (int i = 0; i < arrayLibro.length; i++) {
            System.out.println(arrayLibro[i].getTitulo());
        }

        System.out.println("======================");

        //Opción 2.1: es enviarlo a una estructura con 'collect' (list)
        List<Libro> listaLibros = st3.collect(Collectors.toList());
        for (Libro libro : listaLibros) {
            System.out.println(libro.getTitulo() + " - " + libro.getPaginas());
        }

        System.out.println("======================");

        //Opción 2.1: es enviarlo a una estructura con 'collect' (list)
        Set<Libro> setLibros = st4.collect(Collectors.toSet());
        for (Libro libro : setLibros) {
            System.out.println(libro.getTitulo() + " * " +  libro.getPaginas());
        }

        System.out.println("======================");

        //Se permite con 'Collector' por ejemplo imprimir en una sóla línea
        //separado por2 ","
        String resultado = st5
            .map(l->l.getTitulo())
            .collect(Collectors.joining(", "));
        System.out.println("Libros en una sóla línea: " + resultado);    

        System.out.println("======================");
        //Se puede sumar por ejemplo todas las páginas de los libros
        


        


    }


    
}
