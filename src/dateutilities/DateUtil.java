package dateutilities;


import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.text.DateFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 */
/**
 * different utilities for dates
 * @author Nicholas
 */
public class DateUtil {
    /**
     * takes a local date time variable and converts to string
     * @param date local date time 
     * @return 
     */
   public String toString(LocalDateTime date) {
        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        return df.format(date);
    }
   /**
    * takes a local date and converts to string
    * @param d local date
    * @return 
    */
   public String toString(LocalDate d){
       DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE;
       return df.format(d);
   }
   /**
    * takes a string and converts to local date variable
    * @param s string representing a date in format yyyy-MM-dd
    * @return 
    */
   public LocalDate toDate(String s){
       DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
       LocalDate date = LocalDate.parse(s, df);
       return date;
   }
   /**
    * takes a string and converts to local date time
    * @param date takes a string representing a date and time in format yyyy-MM-dd HH:mm
    * @return 
    */
   public LocalDateTime toDateTime(String date){
       DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
       LocalDateTime date2 = LocalDateTime.parse(date, df);
       return date2;
   }
   /**
    * takes a localdate variable and a long number and adds that number for days to the local date
    * @param lc local date
    * @param daysToAdd long representing days
    * @return 
    */
   public LocalDate addDays(LocalDate lc,long daysToAdd){
       return lc.plusDays(daysToAdd);
   }
   
    public static void main(String[] args) {
        DateUtil app = new DateUtil();
        System.out.println(app.toString(LocalDateTime.now()));
        System.out.println(app.toString(LocalDate.now()));
        System.out.println(app.toDate("2015-10-26"));
        System.out.println(app.toDateTime("2015-10-26 12:34"));
        System.out.println(app.addDays(LocalDate.now(),5));
        
    }
}
