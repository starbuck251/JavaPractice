package uCertify.Access_Modifiers.Pond.Duck;

/**
 * good duckling can access the methods of MotherDuck
 */

public class GoodDuckling {

    public void makeNoise(){
        MotherDuck mamaDuck = new MotherDuck();
        mamaDuck.quack(); //default access
        System.out.println(mamaDuck.noise);

    }

}
