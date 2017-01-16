package JavaInterfaces;

import java.time.*;
import java.lang.*;
import java.util.*;
/**
 * Created by arpit on 15/1/17.
 */
public class TestSimpleTimeClient {
    public static void main(String []args){
        TimeClient myTimeClient = new SimpleTimeClient();
        System.out.println("Current time: " + myTimeClient.toString());
        System.out.println("Time in India: " + myTimeClient.getZonedDateTime("Blah blah").toString());
    }
}
