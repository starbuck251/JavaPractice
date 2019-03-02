package uCertify.Lambdas;
import java.util.ArrayList;
import java.util.List;


public class TraditionalSearch {

    public static void main (String[] args){

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        //print(animals, new CheckIfHopper());
       // print(animals, a -> a.CanHop());
        print(animals, a -> a.CanSwim());

        //animals that cannot swim
        print(animals, a -> ! a.CanSwim());

    }

    private static void print(List<Animal> animals, Animal.CheckTrait checker){
        for (Animal animal : animals){
            if (checker.test(animal))
                System.out.println(animal + " ");
        }
        System.out.println();

    }

}
