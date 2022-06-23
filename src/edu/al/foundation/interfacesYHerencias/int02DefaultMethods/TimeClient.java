package edu.al.foundation.interfacesYHerencias.int02DefaultMethods;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;


public interface TimeClient{
    void setTime(int hour, int minute, int second);

    void setDate(int day, int month, int year);

    void setDateAndTime(int day, int month, int year, int hour, int minute, int second);
        
    LocalDateTime getLocalDateTime();      
    
    //Siendo el método estático queda claro que es sólo para la interfaz.
    //Adicionalmente es un método privado
    static ZoneId getZoneId (String zoneString) {
        try {
            return ZoneId.of(zoneString);
        } catch (DateTimeException e) {
            System.err.println("Invalid time zone: " + zoneString +
                "; using default time zone instead.");
            return ZoneId.systemDefault();
        }
    }   
    
    //Los métodos con prefijo 'default' son justos lo nuevos que afectan
    //a clases ya creadas con dicha interfaz
    default ZonedDateTime getZoneDateTime(String zoneString){
        return ZonedDateTime.of(getLocalDateTime(), getZoneId(zoneString));
    }
}
