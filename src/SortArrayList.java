import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {
    public static void main (String args[]){

        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);

        Collections.sort(numbers);

        System.out.println(numbers);  // prints [,81, 99]

    }

}
