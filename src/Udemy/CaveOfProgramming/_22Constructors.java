package Udemy.CaveOfProgramming;

class Machine{

    private String name;
    private int code;

    public Machine(){
        //machine1 calls this code
        this("Arnie", 6); // this now calls another constructor - the third one down,
                                        //before returning to run the below line
        System.out.println("construcor running");

    }

    public Machine(String name){
        System.out.println("second construcor running");
        this.name = name;
    }

    public Machine(String name, int code){

        System.out.println("third construcor running");
        this.name = name;
        this.code = code;
    }
}

public class _22Constructors {

    public static void main (String [] args){
        Machine machine1 = new Machine(); //constructor calls the first constructor

      //new Udemy.CaveOfProgramming.Machine(); //another way to make a constructor
        Machine machine2 = new Machine("bob");
        Machine machine3 = new Machine("sammy", 4);


    }
}
