package uCertify.Lambdas;
import java.util.ArrayList;
import java.util.List;


public class TraditionalSearch {

    public static void main (String[] args){

        //list of animals
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, true));
        animals.add(new Animal("turtle", false, true));


        //print(animals, new CheckIfHopper());   // pass class that does check

        System.out.println("animals that hop");
        print(animals, a -> a.CanHop());

        System.out.println("animals that swim");
        print(animals, a -> a.CanSwim());

        //animals that cannot swim
        System.out.println("animals that don't swim");
        print(animals, a -> !  a.CanSwim());

    }

    private static void print(List<Animal> animals, Animal.CheckTrait checker){
        for (Animal animal : animals){
            if (checker.test(animal))    // the general check
                System.out.println(animal + " ");
        }
        System.out.println();

    }

}
