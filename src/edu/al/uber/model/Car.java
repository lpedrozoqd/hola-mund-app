package edu.al.uber.model;

public class Car {
    
    Integer id;
    String license;
    Account driver;
    Integer passenger;
    
    /*
    Integer id;
    String license;
    Account driver;
    Integer passenger;
    */

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;

    }

    public void printDataCar(){
        System.out.println("License: " + license + " Driver: " + driver.name);
    }

}
