package edu.al.foundation.lambdas.opcion02;

import java.util.ArrayList;
import java.util.List;

/** 
 * Opción:      2
 * Objetivo:    crear métodos que busquen miembros que 
 *              coincidan con un rango de característica
 */

public class TesterOpcion02 {
    public static void printPersonsWithinAgeRange(List<Person> roster, int lowAge, int highAge){
        for(Person person : roster){
            if (person.getAge() >= lowAge && person.getAge() <= highAge){
                person.printPerson();
            }
        }
    }

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(10));
        persons.add(new Person(20));
        persons.add(new Person(30));
        persons.add(new Person(40));
        persons.add(new Person(55));

        TesterOpcion02.printPersonsWithinAgeRange(persons, 30,55);
        
    }
}

