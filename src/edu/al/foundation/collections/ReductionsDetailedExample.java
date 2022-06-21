package edu.al.foundation.collections;

import java.util.List;

import edu.al.foundation.lambdas.Person;

public class ReductionsDetailedExample {
    public static void main(String[] args) {
        List<Person> roster = Person.createRoster();
        System.out.println("Contendido de 'roster'");
        roster
            .stream()
            .forEach(item->item.printPerson());
        System.out.println("");            
        System.out.println("");            
        
    }
}
