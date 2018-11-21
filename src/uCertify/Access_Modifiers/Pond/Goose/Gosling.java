package uCertify.Access_Modifiers.Pond.Goose;

import uCertify.Access_Modifiers.Pond.Shore.Bird; //in a different package

/**
 * Extending means creating a subclass that has access
 * to any protected or public members of the parent class
 */

public class Gosling extends Bird {
    //extends means create subclass

    public void swim(){
        //calls protected members
        floatInWater();
        System.out.println(text);
    }


}
