package edu.al.foundation.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TesterLambdas {

    //Opción 1: create un método que busca por Person y que haga match
    //en una característica
    public static void printPersonOlderThan(List<Person> roster, int age){
        for(Person person : roster){
            if (person.getAge() >= age){
                person.printPerson();
            }
        }
    }

    //Opción 2: crea un método generalizado basado en el ítem 1
    public static void printPersonWithinAgeRange(
        List<Person> roster, int low, int high){
            for(Person person : roster){
                if (person.getAge() >= low && person.getAge() <= high){
                    person.printPerson();
                }
            }
    }

    interface CheckPerson{
        boolean test(Person p);
    }

    //Opción 3: especificar un criterio de búsqueda con una 'clase local'
    //Opción 4: especifica criterio de búsqueda con 'clase anónima'
    //Opción 5: especifica criterio de búsqueda con una 'expresión lambda'
    public static void printPersons(
        List<Person> roster, CheckPerson tester){
            for(Person person : roster){
                if(tester.test(person)){
                    person.printPerson();
                }
            }
    }

    
    //Opción 6: reconsiderar usar interface 'checkPerson' por interfaces
    //genéricas funcionales con "expresión lambda"
    /*
    interface Predicate<T>{
        boolean test(T t);
    }
    */
    public static void printPersonWithPredicate(
        List<Person> roster, Predicate<Person> tester){
            for(Person person : roster){
                if (tester.test(person)){
                    person.printPerson();
                }
            }
    }

    //Opcion 7.1: en lugar del método anterior 'printPersonWithPredicate', usar
    //'expresiones lambdas' para evaluar y para ejecutar acciones así:
    public static void processPerson(
        List<Person> roster,
        Predicate<Person> tester,
        Consumer<Person> block){
            for(Person person : roster){
                if (tester.test(person)){
                    block.accept(person);
                }
            }
    }

    //Opcion 7.2: en lugar del método anterior 'printPersonWithPredicate', usar
    //'expresiones lambdas' para evaluar, extraer algún dato y para ejecutar acciones así:
    public static void processPersonWithFunction(
        List<Person> roster,
        Predicate<Person> tester,
        Function<Person, String> mapper,
        Consumer<String> block){
            for(Person person : roster){
                if (tester.test(person)){
                    String data = mapper.apply(person);
                    block.accept(data);
                }
            }
    }

    //Opción 8.2: uso de genéricos más extensivamente
    //Teniendo el caso 7.2, lo siguiente será una versión que acepta una colección

    public static <X,Y> void processElements(
        Iterable<X> source,
        Predicate<X> tester,
        Function<X, Y> mapper,
        Consumer<Y> block){
            for (X p: source){
                if (tester.test(p)){
                    Y data = mapper.apply(p);
                    block.accept(data);
                }
            }
    }

    //Opció 9: usar "operaciones agregadas" que aceptarn "funciones lambdas"
    //como parámetros

    




    // =================================================================
    // Programa principal
    // =================================================================


    public static void main(String[] args) {
      List<Person> roster = Person.createRoster();
      for(Person person: roster){
        person.printPerson();
      }
       
      System.out.println("OPCION #1 - personas mayores desde 20 años");
      printPersonOlderThan(roster, 35);
      
      System.out.println("OPCION #2 - personas mayores desde 20 años");
      printPersonWithinAgeRange(roster, 14, 30);

      System.out.println("OPCION #3 - personas quienes son elegibles para selectivo servicios");

      class CheckPersonEligibleForSelectiveService implements CheckPerson{
        @Override
        public boolean test(Person person) {
            return person.getGender() == Person.Sex.MALE 
                && person.getAge() >= 18
                && person.getAge() <= 43;
        }
      }

      printPersons(roster, new CheckPersonEligibleForSelectiveService());

      System.out.println("OPCION #4 - usando 'clase anónima'");
      printPersons(roster, new CheckPerson(){
        @Override
        public boolean test(Person person) {
            return person.getGender() == Person.Sex.FEMALE 
                && person.getAge() >= 29
                && person.getAge() <= 43;
        }
      });

      System.out.println("OPCION #5 - usando una 'expresión lambda'");
      printPersons(roster, (Person person)->  person.getGender() == Person.Sex.FEMALE
            && person.getAge() >= 29
            && person.getAge() <= 43
      );

      System.out.println("OPCION #6 - usando interfaz genérica funcionar 'Predicate<T>");
      printPersonWithPredicate(
          roster, 
          person -> person.getGender() == Person.Sex.FEMALE
            && person.getAge() >= 29
            && person.getAge() <= 43
          );

    
      System.out.println("OPCION #7.1 - usando 'expresiones lambdas' para todo!");
      processPerson(
          roster, 
          person -> person.getGender() == Person.Sex.FEMALE
            && person.getAge() >= 29 
            && person.getAge() <= 40, 
          person -> person.printPerson()
          );

          System.out.println("OPCION #7.2 - usando 'expresiones lambdas' para todo e incluso extrayendo valor y evaluarlo antes de...!");

          processPersonWithFunction(
              roster, 
              p -> 
                p.getGender() == Person.Sex.FEMALE
                && p.getAge() >= 29
                && p.getAge() <= 41,
              p-> p.getEmailAddress(),
              email -> System.out.println(email));

          System.out.println("OPCION #8- usando generics al máximo para las 'expresiones lambdas' para todo e incluso extrayendo valor y evaluarlo antes de...!");
          processElements(
            roster,
            p -> p.getGender() == Person.Sex.FEMALE
                && p.getAge()  >= 29
                && p.getAge() <= 41,
            p -> p.getEmailAddress(),
            email -> System.out.println(email)
        );


    }
}
