package uCertify.Lambdas;

interface myGreeting{
    String processName(String name);
}

public class SimpleExample {

    public static void main(String[] args) {
        myGreeting morningGreeting = (name) -> "Good morning " + name + "!";
        myGreeting eveningGreeting = (name) -> "Good Evening " + name + "!";

        System.out.println(morningGreeting.processName("Zoe"));
        System.out.println(eveningGreeting.processName("Hanny"));
    }

}
