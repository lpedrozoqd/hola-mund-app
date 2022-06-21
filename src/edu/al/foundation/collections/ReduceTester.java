package edu.al.foundation.collections;

import java.util.List;

public class ReduceTester {
    
    public static void main(String[] args) {
        List<Person> roster = Person.createRoster();

        for (Person person : roster) {
            person.printPerson();
        }
        System.out.println("=============================");
        //Opción 1: Suma de todas las edades de los 'varones' (sin usar reduce)
        Integer totalAge = roster
            .stream()
            .mapToInt(Person::getAge)
            .sum();
        System.out.println("==>Opc1: Suma de todas las edades: " + totalAge);            
        System.out.println("=============================");
        //Opción 2: Suma de todas las edades de los 'varones' (usando reduce)
        Integer totalAgeReduce = roster
            .stream()
            .map(Person::getAge)
            .reduce(
                0, 
                (a,b)->a+b);
        System.out.println("==>Opc12 Suma de todas las edades: " + totalAgeReduce);            
        System.out.println("=============================");


    }

}
