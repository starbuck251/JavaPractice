package uCertify.Access_Modifiers.Pond.Duck;

/**
 * Bad duckling cannot access the private methods in FatherDuck
 */
public class BadDuckling {

    public void makeNoise(){
        FatherDuck dadDuck = new FatherDuck();

        /**
         * does not compile
         */
      // dadDuck.quack();
      // System.out.println(dadDuck.noise);
    }

}
