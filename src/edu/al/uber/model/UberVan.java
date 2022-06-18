package edu.al.uber.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UberVan extends Car{
    Map<String, ArrayList<Integer>> typeCarAccepted =
        new HashMap<String, ArrayList<Integer>>();
    
    List<String> seatsMaterial = new ArrayList<String>();
        
    public UberVan(String license, Account driver,
        Map<String,ArrayList<Integer>> typeCarAccepted,
        List<String> seatsMaterial) {
       super(license, driver);
       this.typeCarAccepted = typeCarAccepted;

   }
    
}
