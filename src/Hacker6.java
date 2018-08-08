
import java.io.*;
import java.util.*;

public class Hacker6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //   String S = scanner.nextInt();

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        String S;

        for (int j=0; j<=T; j++){
            S = scan.next();

            for(int i=0; i<S.length();i++){
                if ((i%2)==0){
                    //even
                    System.out.print(S.charAt(i));
                } //end if
            }//end for i

            System.out.print(" ");

            for(int k=0; k< S.length();k++){
                if ((k%2)==1){
                    //odd
                    System.out.print(S.charAt(k));
                } //end if
            } //end for k

            System.out.println();

        } //end for j

        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scan.close();
    }//end main
}//end class