package Udemy.CaveOfProgramming;

class Thing{
    public String name;
    public static String description;
    public static final int LUCKY_NUMBER = 7;

    public static int count = 0;
    public int id;

    public Thing(){
        id = count;
        count++;
    }

    //these can output static and instance variables
    public void showName(){
        System.out.println("object id " + id + ", " +description + " " +name);
    }

    //can only output static variables, not instances
    public static void showInfo(){
        System.out.println("Hello");
      //Won't work  System.out.println(name);

    }
}


public class _23StaticAndFinal {

    public static void main (String [] args){

        Thing.description = "I am a thing";
        Thing.showInfo();
   //     System.out.println(Udemy.CaveOfProgramming.Thing.description);
        System.out.println("before " +Thing.count);

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        thing1.name = "Dad";
        thing2.name = "Mum";

    //    System.out.println(thing1.name);
    //    System.out.println(thing2.name);
        thing1.showName();
        thing2.showName();

        System.out.println(Thing.LUCKY_NUMBER);
        System.out.println("after " +Thing.count);
    }
}
