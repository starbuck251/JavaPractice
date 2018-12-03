package Udemy.JavaMasterclass.Excercises;

public class _22OperatorsEx {
    public static void main (String args []){

        double num1 = 20;
        double num2 = 80;
        double total = (num1 + num2) * 25;

        double remainder = total % 40;

        if (remainder <= 20)
            System.out.println("Total: " + total + " was over the limit of 20, remainder is: " + remainder);

    }
}
