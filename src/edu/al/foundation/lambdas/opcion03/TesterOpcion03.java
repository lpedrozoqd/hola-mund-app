package edu.al.foundation.lambdas.opcion03;

import java.util.ArrayList;
import java.util.List;

import edu.al.foundation.lambdas.opcion03.Person.Sex;

/** 
 * Opción:      4
 * Objetivo:    especificar criterio de búsqueda con una clase anónima
 */

public class TesterOpcion03 {
    interface CheckPerson{
        boolean test(Person p);
    }
    public static void printPersons(List<Person> roster, CheckPersonEligibleForSelectiveService tester){
        for(Person person : roster){
            if (tester.test(person)){
                person.printPerson();
            }
        }
    } 
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(10, Sex.MALE));
        persons.add(new Person(22, Sex.MALE));
        persons.add(new Person(30, Sex.MALE));
        persons.add(new Person(41, Sex.MALE));
        persons.add(new Person(55, Sex.MALE));
  
        printPersons(persons, new CheckPersonEligibleForSelectiveService());
    }   
}
