package Udemy.JavaMasterclass.Excercises;

public class _28MethodsEx {

    public static void main (String args[]) {

        int highScore = calcScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calcScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);



    }

    public static int calcScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver){ //if gameOver == true
            int finalScore = score + (levelCompleted * bonus);
            finalScore+= 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get to position " + position + " on the high score table");
    }


    public static int calculateHighScorePosition(int score){
        if (score > 1000){
            return 1;
        } else if (score > 500 && score < 1000){
            return 2;
        } else if (score > 100 && score < 500){
            return 3;
        }
        return 4;

    }
}
