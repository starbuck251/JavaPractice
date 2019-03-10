package uCertify.Inheritence;

public class _5_3Person {

    private String name;
    public String hairColour;

    public String getName(){
        return name;
    }

    public void greet(){
        System.out.println("Hello my name is " + name);
    }

    public _5_3Person(String name, String hairColour){
        this.name = name;
        this.hairColour = hairColour;
    }

}
