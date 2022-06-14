package edu.al.uber.model;

import java.util.*;

public class UberBlack extends Car{

    Map<String, ArrayList<Integer>> typeCarAccepted = 
        new HashMap<String, ArrayList<Integer>>();
    List<String> seatsMaterial = new ArrayList<String>();    

    public UberBlack(String license, Account driver,
         Map<String,ArrayList<Integer>> typeCarAccepted,
         List<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;

    }
    
}
