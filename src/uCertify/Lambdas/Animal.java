package uCertify.Lambdas;

// this is an anonymous method that can be passed around

public class Animal {

    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String speciesName, boolean hopper, boolean swimmer){
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }

    public boolean CanHop() {
        return canHop;
    }

    public boolean CanSwim() {
        return canSwim;
    }

    public String toString() {
        return species;
    }

    public interface CheckTrait{
        boolean test (Animal a);
    }
}


