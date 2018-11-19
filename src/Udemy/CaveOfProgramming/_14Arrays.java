package Udemy.CaveOfProgramming;

public class _14Arrays {

    public static void main (String [] args){

        int value = 7;

        int [] values;

        values = new int[3];

        values[0]=12;
        values[1]=16;
        values[2]=9;

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);


        for (int i=0; i< values.length; i++){

            System.out.println(values[i]);

        }

        int [] numbers = {4,8,9};

        for (int j=0; j<numbers.length;j++){
            System.out.println(numbers[j]);

        }

    }
}
