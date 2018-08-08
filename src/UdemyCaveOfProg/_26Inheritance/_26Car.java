package UdemyCaveOfProg._26Inheritance;

public class _26Car extends _26Machine {
    public void wipeWindShield(){
        System.out.println("Wiping windshild");
    }

    //use Code > Overide Methods and below is inserted with @Override KEY - Ctl O
    @Override
    public void start() {
       // super.start(); // this uses the parent class
        System.out.println("Car Started");
    }

    public void showInfo(){
        System.out.println("Car name is: " + name);
    }

    /* //one way to over ride a class in the Machine
    public void start(){
        System.out.println("Car Started");
    }
    */
}
