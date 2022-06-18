package edu.al.foundation.classes.herencia;

public class Bicycle {
    public int cadence;
    public int gear;
    public int speed;

    public Bicycle(int startCadence, int startSpeed, int startGear){
        gear = startCadence;
        cadence = startCadence;
        speed = startSpeed;
    }

    public void setCadence(int newValue){
        cadence = newValue;
    }

    public void setGear(int newValue){
        gear = newValue;
    }

    public void applyBrake(int decrement){
        speed -= decrement;
    }

    public void speedUp(int increment){
        speed += increment;
    }
}
