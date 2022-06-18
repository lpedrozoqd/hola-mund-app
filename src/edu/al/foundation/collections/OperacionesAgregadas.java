package edu.al.foundation.collections;

import java.util.List;

import edu.al.foundation.lambdas.Person;

public class OperacionesAgregadas {
    public static void main(String[] args) {
        //Método clásico para iterar sobre una colección:
        List<Person> roster = Person.createRoster();
        for(Person p: roster){
            System.out.println("Name: " + p.getName());
        }

        //Otra manera:
        //Aunque este ejemplo toma más línea que el inicial, este realmente
        //será más conciso para tareas más complejas con datos masivos
        roster
            .stream()
            .forEach(item->System.out.println("Name-v2: " + item.getName()));

        //pipeline: es una secuencia de "operaciones agregadas"
        roster
            .stream()
            .filter(person -> person.getGender() == Person.Sex.FEMALE)
            .forEach(item->System.out.println("Person[using pipeline]: " + item.getName())); 

        //Este esjemplo contiene el cálculo del promedio de edad de todos
        //los miembots contenidos en la colleción con un pipeline que consiste
        //de operaciones agregadas: filter, mapToInt y average
        double averageAge = roster
            .stream()
            .filter(person->person.getGender() == Person.Sex.MALE) //stream
            .mapToInt(Person::getAge)  // mapToInt es un stream y Person::getAge es 'un método referencia' o se podía usar una lambda e->e.getAge
            .average() //'operación terminal' es una instancia de 'OptionalDouble'
            .getAsDouble();                       
        System.out.println("El promedio de edad de los varones es: " + averageAge);    


    }
}
