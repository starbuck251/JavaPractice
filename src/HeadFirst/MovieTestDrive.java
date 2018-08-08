package HeadFirst;

import java.sql.SQLOutput;

class Movie {

     private String title;
     private String genre;
     private int rating;

    void playIt(){
        System.out.println("Playing the movie");
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public String getGenre(){
        return genre;
    }

    public void setRating(int rating){
        this.rating = rating;
    }

    public int getRating(){
        return rating;
    }
}

public class MovieTestDrive{

    public static void main (String [] args){

        Movie one = new Movie();
        one.setTitle("Gone with the Wind");
        one.setGenre("Tragic");
        one.setRating(-2);

        Movie two = new Movie();
        two.setTitle("Lost in Space");
        two.setGenre("Comedy");
        two.setRating(5);

        Movie three = new Movie();
        three.setTitle("Fight Club");
        three.setGenre("Tragic but ultimtately uplifting");
        three.setRating(127);

        one.playIt();

/*
        System.out.println("Movie: " + one.getTitle()+ ". Genre: " + one.getGenre() + ". Rating: " + one.getRating());
        System.out.println("Movie: " + two.getTitle()+ ". Genre: " + two.getGenre() + ". Rating: " + two.getRating());
        System.out.println("Movie: " + three.getTitle()+ ". Genre: " + three.getGenre() + ". Rating: " + three.getRating());
*/
    }

}
