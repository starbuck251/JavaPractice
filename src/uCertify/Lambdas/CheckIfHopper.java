package uCertify.Lambdas;

public class CheckIfHopper implements Animal.CheckTrait {

    public boolean test(Animal a) {
        return a.CanHop();
    }
}
