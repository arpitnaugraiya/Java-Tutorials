package JavaInterfaces;

import java.time.*;

//import java.time.DateTimeException;
//import java.time.LocalDateTime;
//import java.time.ZoneId;
//import java.time.ZonedDateTime;

/**
 * Created by arpit on 12/1/17.
 */
public interface TimeClient {
    void setTime(int hour, int minute, int second);
    void setDate(int day,int month, int year);
    void setDateAndTime(int day, int month, int year, int hour,
                        int minute, int second);
    LocalDateTime getLocalDateTime();
    //ZonedDateTime getZonedDateTime(String zoneString);

    static ZoneId getZoneId (String zoneString) {
        try{
            return ZoneId.of(zoneString);
        }catch (DateTimeException e){
            System.err.println("Invalid time zone: " + zoneString + "; using default time zone instead.");
            return ZoneId.systemDefault();
            }
    }

    default ZonedDateTime getZonedDateTime(String zoneString){
        return ZonedDateTime.of(getLocalDateTime(),getZoneId(zoneString));
    }

}

