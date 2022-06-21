package edu.al.foundation.methodReference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class MethodReferenceTester {
    public static void main(String[] args) {
        List<Person> roster = Person.createRoster();
        for (Person person : roster) {
            person.printPerson();
        }
        System.out.println("=============================");

        Person[] rosterArray = roster.toArray(new Person[roster.size()]);
        for (Person p : rosterArray) {
            p.printPerson();
        }
        System.out.println("=============================");

        class PersonComparator implements Comparator<Person> {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        }

        //Opción 1: hacer ordenamiento sin usar 'método de referencia'
        Arrays.sort(rosterArray, new PersonComparator());

        //Opción 2: hacer ordenamiento sin usar 'método de referencia'
        //usando 'lambda expressions'
        Arrays.sort(rosterArray,
            (Person a, Person b)->{
                return a.getBirthday().compareTo(b.getBirthday());
            }
        );

        //Opción 3: usando método de referencia:
        Arrays.sort(rosterArray, Person::compareByAge);
    }
}
