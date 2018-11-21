package uCertify.Access_Modifiers.Pond.Duck;

/**
 * Private methods here are fine as all in one class
 *
 */
public class FatherDuck {

    private String noise ="quack!";

    //private access is ok
    private void quack(){
        System.out.println(noise);
    }

    //private access is ok
    private void makeNoise(){
        quack();
    }


}
