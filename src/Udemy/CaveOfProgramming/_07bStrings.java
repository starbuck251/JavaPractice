package Udemy.CaveOfProgramming;

public class _07bStrings {
    public static void main (String args[]) {

        String myString = "this is a string";
        System.out.println(myString);

        //numbers in strings are concatenated
        String numberString = "25";
        numberString = numberString + "55";
        System.out.println("result is: " + numberString);

        int myInt = 10;
        numberString = numberString + myInt;
        System.out.println("This value is: " +numberString);


    }
}
