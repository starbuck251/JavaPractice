package uCertify;

import java.util.*;

public class _3_4_Arrays {


    public static void main (String args[]){

        /*
        // example 1
        int[] numbers1 = new int[3];
        System.out.println(numbers1.length);


        // example 2
        int[] numbers2 = new int[]{42,55,99};
        for (int i=0; i<numbers2.length; i++){
            System.out.println(numbers2[i]);
        }

        String [] bugs = {"cricket", "beetle", "ladybug"};
        String [] alias = bugs;
        System.out.println(bugs.equals(alias)); //true
        System.out.println(bugs.toString()); //[Ljava.lang.String;@610455d6

        //Create an array
        String[] mammals={"mammals", "chimp", "donkey"};
        System.out.println(mammals.length);
        System.out.println(mammals[0]);
        System.out.println(mammals[1]);
        System.out.println(mammals[2]);


        //sorting numbers
        int[] numbers = {4,7,2,1,8,10};
        Arrays.sort(numbers);
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+ " ");
        }
*/

        //MultiDimensional Array
        int[][] twoD = new int[3][2];

        //method one
        for(int i=0; i<twoD.length;i++){
            for (int j=0; j<twoD[i].length;j++){
                System.out.print(twoD[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("-----------------");
        //method two
        for(int[] inner : twoD){
            for(int num : inner)
                System.out.print(num + " ");
            System.out.println();
        }

    }

}
