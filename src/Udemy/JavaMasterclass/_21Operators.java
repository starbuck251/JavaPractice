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

        int secondTop = 60;
        if (topScore > secondTop && topScore <100)
            System.out.println("greater than 2nd top and less than 100");


    }
}
