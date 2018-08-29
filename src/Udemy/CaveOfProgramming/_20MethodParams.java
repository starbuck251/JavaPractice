package Udemy.CaveOfProgramming;

class Robot {
    public void speak(String text) {
        System.out.println(text);
    }

    public void jump(int height) {
        System.out.println("Jumping " +height);
    }
    //Receives input from  line 26
    public void move(String direction, double distance) {
        System.out.println("Moving " +distance + " in direction " + direction);
    }
}


public class _20MethodParams {

    public static void main(String[] args) {
        Robot sam = new Robot();

        //content of this is a chute up to line 2 String text
        sam.speak("yo!");
        //content of this is a chute up to line 6 int height
        sam.jump(8);
        //content of this is a chute up to line 10 int height
        sam.move("east", 10.7);

        //send a variable of 'greeting' which references the text 'Hello' to line 2 where it goes in as 'text'
        String greeting = "Hello going to line 2";
        sam.speak(greeting);

        //send a variable of 'value' which is the bucket of memory for '14' to line 6 where it goes in as 'height'
        int value = 14;
        sam.jump(value);

        //Use frog class in another class! woop woop!\
        Frog frog4 = new Frog();
        frog4.setName("Bob");
        String crossclass = frog4.getName();
        System.out.println(crossclass);
    }

}
