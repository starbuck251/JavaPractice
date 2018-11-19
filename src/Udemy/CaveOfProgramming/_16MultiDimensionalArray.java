package Udemy.CaveOfProgramming;

public class _16MultiDimensionalArray {

    public static void main (String [] args){

        int [] values = {3, 5, 2345};

        System.out.println(values[2]);

        int [][] grid = {
                {3, 5 ,23},
                {2, 4},
                {1, 7, 9, 11}
        };
        System.out.println(grid[1][1]); // returns 4
        System.out.println(grid[0][2]); // returns 23


        //iterate rows
        for (int row=0; row<grid.length; row++){
            for(int col=0; col<grid[row].length; col++){
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }



        String[][] texts = new String[2][3];
        texts[0][1] = "Hello there";
        System.out.println(texts[0][1]);

    }
}
