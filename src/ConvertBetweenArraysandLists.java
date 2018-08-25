import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertBetweenArraysandLists {
    public static void main (String args[]) {

        List<String> list = new ArrayList<>();
        Collections.addAll(list, "hawk", "robin", "eagle");

        /**
         * Convert List to Array
         */
        Object[] objectArray = list.toArray(); //doing this will just create an Array of Objects
        System.out.println(objectArray.length);
        String[] stringArray = list.toArray(new String[0]); //this is the way to define the type of Array with a size of 0
        System.out.println(stringArray.length);

        /**
         * Convert Array to List
         */
        String[] array = {"hawk", "robin", "eagle"};
        List<String> list3 = Arrays.asList(array); //returns fixed size list
        System.out.println(list3.size()); //3
        list3.set(1, "test"); //hawk, test, eagle
        array[0] = "new"; // new, test, eagle
        for (String b:array) System.out.print(b+" "); // new, test, eagle

        /**
         * Varargs trick using asList()
         */
        List<String> list4 = Arrays.asList("one", "two");
        System.out.println(list4); //[one, two]


    }
}
