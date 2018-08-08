package UdemyCaveOfProg;

class Froggie{

    private int id;
    private String name;

    //get
    public Froggie(int id, String name){
        this.id = id;
        this.name = name;
    }

    //set

    public String toString(){

        return String.format("%4d: %s", id, name);

        /*
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);
        return sb.toString();
        */
    }

}

public class _25toStringMethod {

    public static void main (String[] args){
        Froggie frog1 = new Froggie(7, "Freddy");
        Froggie frog2 = new Froggie(5, "Bob");

        System.out.println(frog1);
        System.out.println(frog2);

    }
}
