package uCertify.Access_Modifiers.Pond.Swan;

import uCertify.Access_Modifiers.Pond.Shore.Bird; //different package than Bird

public class Swan extends Bird { //but subclass of Bird


    //package access to superclass
    //Swan is not in the same package as Bird, but does extend it-which implies
    //it has access to the protected members of Bird since it is a subclass
    public void swim(){
        floatInWater();
        System.out.println(text);
    }

    //package access to superclass
    //This is allowed because these lines refer to a Swan object. Swan inherits from Bird so this is okay.
    // It is sort of a two-phase check. The Swan class is allowed to use protected members of Bird and we
    // are referring to a Swan object. Granted, it is a Swan object created on line 9 rather than an inherited one,
    // but it is still a Swan object.
    public void helpOtherSwanSwim(){
        Swan other = new Swan();
        other.floatInWater();
        System.out.println(other.text);
    }

    //does not compile
    //This time a Bird reference is used. It is created on line 14. Bird is in a different package, and this code
    // isn't inheriting from Bird, so it doesn't get to use protected members. Say what now? We just got through
    // saying repeatedly that Swan inherits from Bird. And it does. However, the variable reference isn't a Swan.
    // The code just happens to be in the Swan class.
    public void helpOtherBirdSwim(){
        Bird bird = new Bird();
        //other.float //does not compile
        //System.out.println(other.text);
    }


}
