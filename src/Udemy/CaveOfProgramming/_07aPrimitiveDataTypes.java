package Udemy.CaveOfProgramming;

public class _07aPrimitiveDataTypes {

    public static void main(String[] args) {

        /**
         * primitive variables
         */
        int myMinValue; //32 bit value of
        myMinValue = -2_147_483_648; //to 2_147_483_648

        //16 bit value
        short myShort = 32767;
        //64 bit value has L on end
        long myLong = 9_223_372_036_854_775_807L;

        byte myByte = 127;  //8bits of data, -127 t0 127
        //cast to a byte but putting the type in brackets before, else Java will convert to int
        byte myNewByteValue = (byte)(myByte/2);
        System.out.println(myNewByteValue); //63

        //width of float = 32 (4 bytes)
        float myFloat = 5f / 3f;  //1.6666666 shorter than double, have to add f to end else it's a double by default
        System.out.println(myFloat);

        //width of double = 64 (8 bytes)
        double myDouble = 5d / 3d;  //1.6666666666666667
        System.out.println(myDouble);
        double pi = 3.141_592_7d; //you can use underscores here also to look clearer


        //single character - use chars or unicode characters
        char myChar = 'y';
        char unicode = '\u00A9'; //enter a backslash u and then the unicode number
        System.out.println("unicode " +unicode);

        //true or false
        boolean myBoolean = true;




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


         //convert pounds to kgs
         double mypound = 200d;
         double kg = mypound * 0.4535937d;

         System.out.println(mypound + " pounds is equal to "+ kg+ " kilograms" );


    }
}