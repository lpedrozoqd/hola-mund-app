package edu.al.foundation.lambdas.opcion04;


import java.time.LocalDate;

/** 
 * Opción:      4
 * Objetivo:    especificar criterio de búsqueda con una clase local
 */

public class Person {
    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;
    int age;

    public Person(int age, Sex gender){
        this.age = age;
        this.gender = gender;
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

    public void setSex(Sex sex){
        gender = sex;
    }

    public Sex getSex(){
        return gender;
    }


    public void printPerson(){
        System.out.println(
            "(OPCION #) Name: " + name +
            " Birthday: " + birthday +
            " Gender: " + gender +
            " Email: " + emailAddress +
            " Age: " + age);
    }
}


