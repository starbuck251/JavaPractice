package uCertify;

public class _4_1_MethodDesign {

    /**
     * Access Modifiers
     * public - can be called from any class
     * private - can only be called within same class
     * protected - can only be called from classes in same package or subclasses
     * Default - (No modifier) - can only be called from classes in same package
     */

    public void walk1(){}
    void walk2 (){}

    /**
     * Optional Specifiers
     * static - used for class methods
     * abstract - used when not providing method body
     * final - used when a method is not allowed to be overridden by a subclass
     * synchronised - ?
     * native - used when interacting with code written in another language like C++
     * strictfp - used for making floating point calculations portable
     */

    public final void walk3(){}
    public static final void walk4(){}
    public final static void walk5(){}
    final public void walk6(){}

    /**
     * Return Types
     * methods must have return types unless they are void
     * void - no return type
     */

    public void walk7(){}
    public void walk8(){return;}
    public String walk9() {return "";}

    int integer(){
        int temp =9;
        return temp;
    }

    /**
     * Method Names
     * can only start with
     *      $
     *      _
     *      alpha - should be lower case
     */

}
