package Udemy.JavaMasterclass;

/**
 * Need to finish this
 */
public class _35OverloadingExcercise {

    public static void main (String args[]) {


        double cm = calcFeetAndInchesToCentimeters(1,4);
        System.out.println("Number of cm is: " + cm);

    }


    public static int calcFeetAndInchesToCentimeters(int feet, int inches){

        if ((feet >= 0) && (inches >=0 && inches <=12)){
            System.out.println("valid");
            return feet * inches;
        }
        else{
            return -1;
        }

    }

}
