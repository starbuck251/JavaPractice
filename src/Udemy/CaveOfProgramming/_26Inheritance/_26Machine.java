package Udemy.CaveOfProgramming._26Inheritance;

public class _26Machine {

    //This variable is 'private' and can only be accessed in this class - despite inheritance Car Class cannot access
    //private String name = "Machine 1";

    //This variable is 'protected' so can be accessed by any class in the package (including the child classes)
    protected String name = "Machine 1";

    public void start(){
        System.out.println("Machine Started");
    }

    public void stop(){
        System.out.println("Machine stopped");
    }

}
