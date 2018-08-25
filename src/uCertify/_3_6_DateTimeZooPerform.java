package uCertify;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class _3_6_DateTimeZooPerform {

    public static void main(String args[]){
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        Period period = Period.ofMonths(1);  //create a period
        performAnimalEnrichment(start, end, period);
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period){

        LocalDate upTo = start;

        while (upTo.isBefore(end)){
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period);
        }
    }

}
