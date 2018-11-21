package uCertify.Access_Modifiers.Pond.Swan;

import uCertify.Access_Modifiers.Pond.Duck.MotherDuck;

public class BadCygnet {

    public void makeNoise(){
        MotherDuck duck = new MotherDuck();

        /**
         * does not compile
         */
        // duck.quack();
        // System.out.println(duck.noise);
    }

}
