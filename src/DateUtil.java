
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
public class DateUtil {
   public String toString(LocalDateTime date) {
        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        return df.format(date);
    }
   public String toString(LocalDate d){
       DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE;
       return df.format(d);
   }
   public LocalDate toDate(String s){
       DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
       LocalDate date = LocalDate.parse(s, df);
       return date;
   }
   public LocalDateTime toDateTime(String date){
       DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
       LocalDateTime date2 = LocalDateTime.parse(date, df);
       return date2;
   }
   
   public LocalDate addDays(LocalDate jim,long daysToAdd){
       return jim.plusDays(daysToAdd);
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
