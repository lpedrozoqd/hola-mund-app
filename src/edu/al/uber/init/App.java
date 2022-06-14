package edu.al.uber.init;

import edu.al.uber.model.Account;
import edu.al.uber.model.Car;
import edu.al.uber.model.UberX;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        //1er. ejemplo
        Car car = new Car();
        car.license = "JXK498";
        car.driver = "Leonel Pedrozo";
        car.passenger = 7;
        System.out.println("Car license: " + car.license);
        */

        //2do. ejemplo:
        /*
        Car car = new Car("JXK498", new Account("Leonel Pedrozo","12400476"));
        car.printDataCar();
        */

        //3er. ejemplo:
        UberX uberX = new UberX("JXK498", new Account("Leonel Pedrozo","12400476"), "Suzuki", "2021");
        uberX.setId(12400476);
        uberX.printDataCar();

    }
}
