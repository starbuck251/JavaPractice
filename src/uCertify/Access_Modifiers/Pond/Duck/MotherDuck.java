package uCertify.Access_Modifiers.Pond.Duck;

/**
 * Default (Package Private) Access
 * Allows classes in same package to access members of this class
 */

public class MotherDuck {

    String noise = "quack";

    void quack(){
        System.out.println(noise); //default access is ok
    }

    private void makeNoise(){
        quack(); //default access is ok
    }
}

