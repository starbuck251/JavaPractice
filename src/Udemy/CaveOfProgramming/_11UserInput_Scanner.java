package Udemy.CaveOfProgramming;

import java.util.Scanner;

public class _11UserInput_Scanner {

    public static void main(String[] args) {

        //create scanner object
        Scanner input = new Scanner(System.in);

        //output the prompt
        System.out.println("Enter some value: ");

        //wait for the user to enter a line of text
        //  String line = input.nextLine();
        //  double value1 = input.nextDouble();

        int value = input.nextInt();

        //Tell them what they entered
        System.out.println("You entered "  + value);




    }
}