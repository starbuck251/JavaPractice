package Udemy.CaveOfProgramming._26Inheritance;

public class _26App {
    public static void main (String [] args){
        _26Machine mach1 = new _26Machine();

        mach1.start();
        mach1.stop();


        _26Car car1 = new _26Car();

        car1.start();
        car1.stop();
        car1.showInfo();


    }
}
