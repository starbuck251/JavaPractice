import java.util.*;


public class UcertifyArrayList {

    /**
     * ArrayLists are Lists
     * you can store ArrayList in a List but not the other way round.
     * Because Lists are interfaces, and interfaces cannot be instantiated
     */

/*    ArrayList list1 = new ArrayList();
    ArrayList list2 = new ArrayList(10);
    ArrayList list3 = new ArrayList(list2); //this makes a copy of list2

    //specify the TYPE of ArrayList frmo Java 5
    ArrayList <String> list4 = new ArrayList<String>();

    //from Java 7 you don't need the right side but you do need diamond operator<>
    ArrayList<String> list5 = new ArrayList<>();

    //Lists can hold ArrayLists
    List<String> list6 = new ArrayList<>();
    //but ArrayLists cannot hold Lists, so the below will not compile
    //ArrayList<String> list7 = new List<>();
 */
public static void main (String args[])

    {

        List<String> birds = new ArrayList<>();

        /**
         * add() items - ArrayList technically starts with no size
         */
        birds.add("hawk"); //added to end (ie index 0)
        System.out.println(birds); //hawk
        birds.add(1, "robin"); //index 1 happens to now be the end
        System.out.println(birds); //hawk, robin
        birds.add(0,"blue jay"); // this is added to the start
        System.out.println(birds); //blue jay, hawk, robin
        birds.add(1, "cardinal"); // this is now the middle as hawk and robin have moved up
        System.out.println(birds); // blue jay, cardinal, hawk, robin

        /**
         * remove() items using name or the index
         */
        System.out.println(birds.remove("cardinal")); //remove by name - returns true
        System.out.println(birds.remove("eagle")); // returns false as didn't exist
        System.out.println(birds.remove(0)); //remove by index - returns blue jay
        System.out.println(birds); // hawk, robin - remain

        /**
         * set() changes one of the elements without changing the size
         */
        birds.add("cardinal");
        birds.add("eagle");
        System.out.println(birds); //hawk, robin, cardinal, eagle
        birds.set(1, "sparrow"); // changes the item robin at index 1 to sparrow
        System.out.println(birds); //hawk, sparrow, cardinal, eagle

        /**
         * isEmpty() and size() - look at how many slots in use
         */
        System.out.println(birds.isEmpty()); //returns false
        System.out.println(birds.size()); //returns 4

        /**
         * clear() is an easy way to discard all elements of ArrayList
         */
        birds.clear();
        System.out.println(birds.isEmpty()); //returns 
        System.out.println(birds.size());

    }

}
