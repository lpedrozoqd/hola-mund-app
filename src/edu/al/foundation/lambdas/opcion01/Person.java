package edu.al.foundation.lambdas.opcion01;

import java.time.LocalDate;

/** 
 * Opción:      1
 * Objetivo:    crear métodos que busquen miembros que 
 *              coincidan con una característica
 */

public class Person {
    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;
    int age;

    public Person(int age){
        this.age = age;
    }
    public enum Sex{
        MALE, FEMALE
    }

    public void setAge(int newValue){
        age = newValue;
    }

    public int getAge(){
        return age;
    }

    public void printPerson(){
        System.out.println(
            "(OPCION #1) Name: " + name +
            " Birthday: " + birthday +
            " Gender: " + gender +
            " Email: " + emailAddress +
            " Age: " + age);
    }
}


