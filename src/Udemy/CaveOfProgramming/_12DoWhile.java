package Udemy.CaveOfProgramming;

import java.util.Scanner;

public class _12DoWhile {

    public static void main(String[] args) {

        //create scanner object
        Scanner input = new Scanner(System.in);

        /*
        System.out.println("Enter some value: ");

        int value = input.nextInt();

        while (value != 5) {

            System.out.println("You entered "  + value);
            value = input.nextInt();
        }
    */
        int value =0;
        do {
            System.out.println("Enter some value: ");
            value = input.nextInt();
        }
        while(value != 5);

        System.out.println("Got 5!");




    }
}