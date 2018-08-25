package uCertify;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _3_6_DatesAndTimes {
    public static void main (String args[]) {

        /**
         * Getting dates and times
         */

        System.out.println(LocalDate.now());  // 2018-08-08
        System.out.println(LocalTime.now());  // 17:45:14.350
        System.out.println(LocalDateTime.now()); // 2018-08-08T17:45:14.350

        /**
         * Creating dates and times
         */
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY,20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);

        LocalTime time1 = LocalTime.of(6,15);
        LocalTime time2 = LocalTime.of(6,15, 30);
        LocalTime time3 = LocalTime.of(6,15,30,200);

        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);

        /**
         * Working with Periods of time
         */
        LocalDate dateP1 = LocalDate.of(2015, 1, 20);
        LocalTime timeP1 = LocalTime.of(6,15);
        LocalDateTime dateTimeP1  = LocalDateTime.of(dateP1,timeP1);
        Period periodP1 = Period.ofMonths(1);
        System.out.println(dateP1.plus(periodP1));
        System.out.println(dateTimeP1.plus(periodP1));
      //  System.out.println(timeP1.plus(periodP1)); // you can't add a month to time UnsupportedTemporalTypeException

        /**
         * Date Time Formatter
         */
        System.out.println(dateP1.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(timeP1.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTimeP1.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDateTime.format(dateTimeP1));
        System.out.println(shortDateTime.format(dateP1));
      //  System.out.println(shortDateTime.format(timeP1));//time can't be formatted as a date UnsupportedTemporalTypeException

        //the last set can also be written as
        System.out.println(dateTimeP1.format(shortDateTime));
        System.out.println(dateP1.format(shortDateTime));
       // System.out.println(timeP1.format(shortDateTime));

        /**
         * Create your own format
         */
        DateTimeFormatter f = DateTimeFormatter.ofPattern("\nMMMM dd, yyyy, hh:mm");
        System.out.println(dateTimeP1.format(f));
    }
}
