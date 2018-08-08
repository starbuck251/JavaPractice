package UdemyCaveOfProg._28Interfaces;

public class Person implements Info{

    private String name;

    //right click, generate Constructor!
    public Person(String name) {
        this.name = name;
    }

    public void greet(){
        System.out.println("Hello there");
    }

    public void showInfo(){
        System.out.println("Person name is: "+ name);


    }
}
