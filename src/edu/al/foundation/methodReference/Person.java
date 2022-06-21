package edu.al.foundation.methodReference;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;

/** 
 * Opción:      1
 * Objetivo:    crear métodos que busquen miembros que 
 *              coincidan con una característica
 */

public class Person {
    
    public enum Sex{
        MALE, FEMALE
    }

    
    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person(String nameArg, LocalDate birthdayArg,
        Sex genderArg, String emailArg){
        name = nameArg;
        birthday = birthdayArg;
        gender = genderArg;
        emailAddress = emailArg;
    }

    public int getAge(){
        return birthday
            .until(IsoChronology.INSTANCE.dateNow())
            .getYears();
    }

    public void printPerson(){
        System.out.println(
            "Name: " + name +
            " Birthday: " + birthday +
            " Gender: " + gender +
            " Email: " + emailAddress);
    }

    public Sex getGender(){
        return gender;
    }

    public String getName(){
        return name;
    }

    public String getEmailAddress(){
        return emailAddress;
    }

    public LocalDate getBirthday(){
        return birthday;
    }

    public static int compareByAge(Person a, Person b){
        return a.birthday.compareTo(b.birthday);
    }

    public static List<Person> createRoster(){
        List<Person> roster = new ArrayList<>();
        roster.add(
            new Person("Fred", IsoChronology.INSTANCE.date(1980, 6, 20), Person.Sex.MALE, "fred@clarap.co")
            );
        roster.add(
            new Person("Jane", IsoChronology.INSTANCE.date(1990, 7, 15), Person.Sex.FEMALE, "jane@clarap.co")
            );
        roster.add(
            new Person("George", IsoChronology.INSTANCE.date(1991, 8, 13), Person.Sex.MALE, "george@clarap.co")
            );
        roster.add(
            new Person("Bob", IsoChronology.INSTANCE.date(1980, 6, 20), Person.Sex.MALE, "bob@clarap.co")
            );
        
        return roster;
    }


}


