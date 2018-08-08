package UdemyCaveOfProg;

class Person{

    String name;
    int age;

    void speak() {
        System.out.println("My name is: " + name);
    }

    int calculateYears() {
        int yearsLeft = 65-age;
        return yearsLeft;
    }
    //Get methods
    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }
}

public class _19Getters {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "John";
        person1.age = 7;
        person1.speak();

        int years = person1.calculateYears();
        System.out.println("value that is returned from calculateYears method = "+ years);

        //Use the Get methods
        int age = person1.getAge();
        System.out.println(age);

        String name = person1.getName();
        System.out.println(name);

    }

}
