package uCertify.Inheritence;

public class _5_3Friend extends _5_3Person{
    private String favour;

    public _5_3Friend(String name, String haiColour, String favour){
        super(name, haiColour);
        this.favour = favour;
    }

    public void doFavour(){
        System.out.println("Hey friend do me this favour! "+favour);
    }

    @Override
    public void greet(){
        System.out.println("Hey friend, it's "+ getName());
    }
}
