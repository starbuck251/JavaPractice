package Udemy.CaveOfProgramming;

class Frog{
    //private means that the instance variables cannot be accessed outside of the class
    private String name;
    private int age;

    public void setName(String name) {
        //this below refers to the variable in this class
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setInfo (String name, int age){
        setName(name);
        setAge(age);
    }
}

public class _21SettersThis {

    public static void main(String[] args) {
        Frog frog1 = new Frog();

        frog1.setName("Bertie");
        frog1.setAge(7);
        System.out.println(frog1.getName() +"and" + frog1.getAge());

    }

}
