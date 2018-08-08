public class BeerSong {

    public static void main (String[] args){

        int numBeer = 99;
        String word = "bottles";

        while (numBeer > 0) {

            if (numBeer == 1) {
                word = "bottle";
            } else

                System.out.println(numBeer + " " + word + " of beer on the wall, ");
            System.out.println(numBeer + " " + word + " of beer! Take one down and pass it around");

            numBeer = numBeer - 1;


            if (numBeer > 0) {
                System.out.println("There's " + numBeer + " " + word + " of beer on the wall,");
            } else {
                System.out.println("There's no more bottles of beer on the wall!");
            }
        }
    }


}
