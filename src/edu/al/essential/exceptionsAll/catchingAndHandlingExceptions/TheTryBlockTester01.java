package edu.al.essential.exceptionsAll.catchingAndHandlingExceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class TheTryBlockTester01 {
    private  List<Integer> list;
    private  final int SIZE = 10;

    public TheTryBlockTester01(){
        list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
    }

    public void writeList(){
        PrintWriter out = null;
        System.out.println("==> TheTryBlock");

        try{
            System.out.println(">> Iniciando...");
            out = new PrintWriter(new FileWriter("c:\\temp2\\outfile.txt"));
            for (int i = 0; i < SIZE; i++) 
                out.println("Valor en: " + i + " = " + list.get(i));
        }catch(IndexOutOfBoundsException e){
            System.err.println("Error IndexOutOfBoundsException: " + e.getMessage());
        }catch (IOException e){
            System.err.println("Error IOException: " + e.getMessage());
        }finally{
            if (out != null){
                System.out.println("Cerrando PrintWriter");
                out.close();
            }else{
                System.out.println("Prinwriter no está abierto");
            }
        }
    }

    public static void main(String[] args) {
        TheTryBlockTester01 t = new TheTryBlockTester01();
        t.writeList();
    }
    
}
