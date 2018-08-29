package Udemy.CaveOfProgramming;


public class _24StringBuilder {
    public static void main (String [] args){

        String info = "";
        info += "My name is bob.";
        info += "";
        info += "I am a builder";

        System.out.println(info);

        //More efficient
        StringBuilder sb = new StringBuilder("");
        sb.append("My name is Zoe.");
        sb.append(" ");
        sb.append("I am a tester");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();
        s.append("My name is Roger.")
                .append(" ")
                .append("I am a pilot");

        System.out.println(s.toString());

        /////////Formatting/////// sout tab
        System.out.println("Here is some text.\tThat was a tab.\nThat was a new line");

        //print format of integers
        System.out.printf("Total cost %d; quantity is %d", 5, 120);
        System.out.println("");

        // putting %10 will put a 10 char wide space, put -10 to left align
        System.out.printf("Total cost %10d; quantity is %d\n", 5, 120);
        System.out.printf("Total cost %-10d; quantity is %d\n", 5, 120);

        for(int i =0; i<5; i++){
            System.out.printf("%2d: some text here\n", i);
        }

        //put strings in with %s
        for(int i =0; i<5; i++){
            System.out.printf("%2d: %s\n", i, "some different text");
        }

        //floating point formatter %f, put the number of decimal places between the % and f as %.2f
        System.out.printf("Total value: %.2f\n", 5.6874);
        System.out.printf("Total value: %9.1f\n", 345.65464);


    }
}
