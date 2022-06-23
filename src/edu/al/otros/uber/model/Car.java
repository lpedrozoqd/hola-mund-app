package edu.al.otros.uber.model;

public class Car {

    Integer id;
    String license;
    Account driver;
    Integer passenger;
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;

    }    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    public Integer getPassenger() {
        return passenger;
    }

    public void setPassenger(Integer passenger) {
        this.passenger = passenger;
    }


    public void printDataCar(){
        System.out.println("Id: " + id +  " License: " + license + " Driver: " + driver.name);
    }

}
