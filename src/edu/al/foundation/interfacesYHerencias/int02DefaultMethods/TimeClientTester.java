package edu.al.foundation.interfacesYHerencias.int02DefaultMethods;

import java.time.*;

public class TimeClientTester implements TimeClient {


    private LocalDateTime dateAndTime;
    
    public TimeClientTester() {
        dateAndTime = LocalDateTime.now();
    }

    @Override
    public void setTime(int hour, int minute, int second) {
        LocalDate currentDate = LocalDate.from(dateAndTime);
        LocalTime timeToSet = LocalTime.of(hour, minute, second);
        dateAndTime = LocalDateTime.of(currentDate,timeToSet);
        System.out.println("==>setTime: " + dateAndTime.toString());
    }

    @Override
    public void setDate(int day, int month, int year) {
        LocalDate dateToSet = LocalDate.of(day, month, year);
        LocalTime currentTime = LocalTime.from(dateAndTime);
        dateAndTime = LocalDateTime.of(dateToSet, currentTime);
        
    }

    @Override
    public void setDateAndTime(int day, int month, int year, int hour, int minute, int second) {
        LocalDate dateToSet = LocalDate.of(day, month, year);
        LocalTime timeToSet = LocalTime.of(hour, minute, second); 
        dateAndTime = LocalDateTime.of(dateToSet, timeToSet);        
        
    }

    @Override
    public LocalDateTime getLocalDateTime() {
        return dateAndTime;
    }


    

    @Override
    public String toString() {
        return "TimeClientTester [dateAndTime=" + dateAndTime.toString() + "]";
    }

    public static void main(String[] args) {
        TimeClientTester t = new TimeClientTester();
        t.setTime(14, 50, 23);
        System.out.println("Zone time: " + t.getZoneDateTime("-5").toString());
    }
    
}
