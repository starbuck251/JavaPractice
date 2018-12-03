package Udemy.JavaMasterclass;

public class _21Operators {

    public static void main (String args[]) {

        int result = 1+2;
        System.out.println(result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result +1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result +=2;
        System.out.println("Result is now " + result);
        result *=10;
        System.out.println("Result is now " + result);
        result -=10;
        System.out.println("Result is now " + result);
        result /=10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if(isAlien == true)
            System.out.println("It is not an alien!");
        else
            System.out.println("fail");

        int topScore = 80;
        if (topScore >= 100)
            System.out.println("you got the highscore");

        if (topScore !=100)
            System.out.println("not 100");

        //Using AND
        int secondTop = 90;
        if (topScore > secondTop && topScore <100)
            System.out.println("Greater than 2nd top and less than 100");

        //Using OR
        if ((topScore > 90) || (secondTop <= 90))
            System.out.println("one of these tests is true");


        //Ternary operator
        /*shorter way to write:

        if (isCar == true)
            wasCar = true
        else
            wasCar =  false
         */

        boolean isCar = true;

        boolean wasCar = isCar ? true : false;
        if (wasCar) //if wasCar == true
            System.out.println("wasCar is true");

        //list of operators online
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
        // java operatorw precedence table
        // http://cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html

    }
}
