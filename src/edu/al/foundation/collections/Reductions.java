package edu.al.foundation.collections;

import java.util.List;

import javax.sql.RowSetReader;

import edu.al.foundation.lambdas.Person;

public class Reductions {
    public static void main(String[] args) {
        List<Person> roster = Person.createRoster();
        double averageAge =  roster
            .stream()
            .filter(person->person.getGender() == Person.Sex.MALE)
            .mapToInt(e->e.getAge())
            .average()
            .getAsDouble();
        System.out.println("Promedio de edad de varones es: " + averageAge);            
    }
    
    

}
