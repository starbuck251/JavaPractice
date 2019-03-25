package uCertify.Inheritence;

public class _5_3Friend extends _5_3Person{
    //this is the extra thing that a friend does that is not part of person class
    private String favour;

    public _5_3Friend(String name, String haiColour, String favour){
        super(name, haiColour);
        this.favour = favour;
    }

    public void doFavour(){
        System.out.println("Hey friend do me this favour! "+favour);
    }

    //here we can specify a different greeting. Use the override so that it's not
    //seen as a different class if there's a spelling mistake
    @Override
    public void greet(){
        System.out.println("Hey friend, it's "+ getName());
    }
}
