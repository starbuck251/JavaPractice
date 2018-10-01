package Udemy.CaveOfProgramming;

public class _10If {

    public static void main(String[] args) {

        int myInt = 30;

        if (myInt < 10 ){
            System.out.println("True");
        }
        else if (myInt >30){
            System.out.println("false");
        }
        else {
            System.out.println("none");
        }

        /*****************************************/

        int loop = 0;

        while (loop < 10){
            System.out.println("Looping " +loop);

            if (loop == 5) {
                break;
            }

            loop++;

            System.out.println("Running");

        }


    }
}