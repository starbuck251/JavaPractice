package Udemy.CaveOfProgramming;

import java.util.Scanner;

public class _13Switch {

    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        String text = input.nextLine();
        System.out.println("Please enter a command");

        switch (text){
            case "start":
                System.out.println("machine started");
                break;
            case "stop":
                System.out.println("machine stopped");
                break;
        }

    }
}
