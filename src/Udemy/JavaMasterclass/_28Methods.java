package Udemy.JavaMasterclass;

public class _28Methods {

    public static void main (String args[]) {

      /*  boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;*/

        //the 'finalScore' returned from the method is put into the highScore int
        int highScore = calcScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calcScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

       /* score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver){ //if gameOver == true
            // the int finalScore is only in scope IN THIS code block
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }*/
    }

    public static int calcScore(boolean gameOver, int score, int levelCompleted, int bonus){
        /*boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;*/

        if (gameOver){ //if gameOver == true
            // the int finalScore is only in scope IN THIS code block
            int finalScore = score + (levelCompleted * bonus);
            finalScore+= 2000;
            return finalScore;
        }
        return -1;

    }

}
