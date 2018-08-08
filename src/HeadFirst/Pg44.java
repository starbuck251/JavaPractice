package HeadFirst;

public class Pg44 {

        public static void main(String [] args) {
            Echo e1 = new Echo();

            Echo e2 = e1;

            int x = 0;
            while ( x<5 ) {
                e1.hello();
                //a line__
                e1.count = e1.count+1;
                System.out.println("e1 line 14" +e1.count+ "e2"+e2.count);
                if ( x<4 ) {
                    e2.count = e2.count + 1; }
                if ( x>0 ) {
                    e2.count = e2.count + e1.count;
                }
                x = x + 1;
            }
            System.out.println(e2.count); }


}

class Echo{
    int count = 0;
    void hello(){
        System.out.println("helloooooo...");
    }
}