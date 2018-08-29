package Udemy.CaveOfProgramming;

public class _07Variables {

    public static void main(String[] args) {

        /**
         * primitive variables
         */
        int myNumber; //32 bit value
        myNumber = 88;

        short myShort = 847; //16 bit value
        long myLong = 9797; //64 bit value

        double myDouble =7.354;  //has floating point
        float myFloat = 234.6f;  //shorter than double, have to add f to end else it's a double

        char myChar = 'y';   //single character
        boolean myBoolean = true;  //true or false

        byte myByte = 127;  //8bits of data - about 127 is top number

        System.out.println(myNumber);
        System.out.println(myShort);

    }
}