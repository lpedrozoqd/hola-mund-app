package edu.al.foundation.lambdas.opcion01;

import java.util.ArrayList;
import java.util.List;

/** 
 * Opción:      1
 * Objetivo:    crear métodos que busquen miembros que 
 *              coincidan con una característica
 */

public class TesterOpcion01 {
    public static void printPersonOlderThan(List<Person> roster, int age){
        for(Person person : roster){
            if (person.getAge() >= age){
                person.printPerson();
            }
        }
    }

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(10));
        persons.add(new Person(20));
        persons.add(new Person(30));

        TesterOpcion01.printPersonOlderThan(persons, 22);
        
    }
}
