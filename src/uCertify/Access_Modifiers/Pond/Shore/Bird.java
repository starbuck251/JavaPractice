package uCertify.Access_Modifiers.Pond.Shore;

/**
 * Protected Access allows everything that default (package) access
 * allows and more.
 * You can access members of parent class.
 */

public class Bird {
    protected  String text = "floating";
    protected void floatInWater(){
        System.out.println(text);
    }
}
