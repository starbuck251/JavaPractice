package Udemy.CaveOfProgramming;

public class _07PrimitiveDataTypes {

    public static void main(String[] args) {

        /**
         * primitive variables
         */
        int myMinValue; //32 bit value of
        myMinValue = -2_147_483_648; //to 2_147_483_648

        short myShort = 32767; //16 bit value
        long myLong = 9_223_372_036_854_775_807L; //64 bit value has L on end

        double myDouble =7.354;  //has floating point
        float myFloat = 234.6f;  //shorter than double, have to add f to end else it's a double

        char myChar = 'y';   //single character
        boolean myBoolean = true;  //true or false

        byte myByte = 127;  //8bits of data, -127 t0 127
        //cast to a byte but putting the type in brackets before, else Java will convert to int
        byte myNewByteValue = (byte)(myByte/2);

        System.out.println(myNewByteValue); //63


        /**
         * Exercises
         */

         byte testByte = 100;
         short testShort = 250;
         int testInt = 1_500;
         long testLong = (50_000L + 10L * (testByte+testShort+testInt));
         short shortTotal = (short) (100+10 *(testByte+testShort+testInt));
         System.out.println(testLong);
        System.out.println(shortTotal);

    }
}