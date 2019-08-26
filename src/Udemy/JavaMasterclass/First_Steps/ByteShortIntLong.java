package Udemy.JavaMasterclass.First_Steps;

public class ByteShortIntLong {

    public static void main(String[] args) {
        int myValue = 10000;

        //INT
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Min: " + myMinIntValue);
        System.out.println("Integer Max: " + myMaxIntValue);
        System.out.println("BUSTED Max: " + (myMaxIntValue + 1));

        //BYTE
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Min: " + myMinByteValue);
        System.out.println("Byte Max: " + myMaxByteValue);

        //SHORT
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Min: " + myMinShortValue);
        System.out.println("Short Max: " + myMaxShortValue);

        //LONG
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Min: " + myMinLongValue);
        System.out.println("Long Max: " + myMaxLongValue);
    }
}
