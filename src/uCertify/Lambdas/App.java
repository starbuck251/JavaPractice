package uCertify.Lambdas;

interface Executable{
    void execute();
}

interface Executable2{
    int execute();
}

interface Executable3{
    int execute(int a);
}

interface Executable4{
    int execute(int a, int b);
}

//****************************************************************************
class Runner {
    public void run(Executable e) {
        System.out.println("exectuting code block...");
        e.execute();
    }
}

//example with a return value
class Runner2{
    public void runAnother(Executable2 f){
        System.out.println("the other code block...");
        int value = f.execute();
        System.out.println("Return value .. " + value);
    }
}

//example with a return value
class Runner3{
    public void runAnotherOne(Executable3 f){
        System.out.println("the other code block...");
        int value = f.execute(12);
        System.out.println("Return value .. " + value);
    }
}

//example with 2 parameter values
class Runner4{
    public void runAnotherOne(Executable4 f){
        System.out.println("the other code block...");
        int value = f.execute(12, 13);
        System.out.println("Return value .. " + value);
    }
}
//****************************************************************************
public class App {
    public static void main(String[] args) {
        Runner runner = new Runner();

        //this code is the equivalent to the lambda expression below
//        runner.run(new Executable() {
//           public void execute(){
//               System.out.println("Hello");
//           }
//        });
        System.out.println("----------------------------");

        //instead you can just write
        runner.run(() -> {
            System.out.println("lambda hello");
        });

//****************************************************************************

        //this code is the equivalent to the lambda expression below
        // the example with the return value
        Runner2 run2 = new Runner2();
            run2.runAnother(new Executable2() {
                public int execute() {
                    return 7;
                }
            });
        System.out.println("----------------------------");

        //instead you can just write
        run2.runAnother(()-> 7);

//****************************************************************************

        //this code is the equivalent to the lambda expression below
        // the example with the return value
        Runner3 run3 = new Runner3();
        run3.runAnotherOne(new Executable3() {
            public int execute(int a) {
                return 7 + a;
            }
        });
        System.out.println("----------------------------");

        //instead you can just write
        run3.runAnotherOne((int a)-> {
            System.out.println("another bit of text");
            return 7 + a;
        });
        //or neater like this as the a does not require brackets around it ike above
        run3.runAnotherOne(a -> {
            System.out.println("another bit of text");
            return 7 + a;
        });

//****************************************************************************

        //this code is the equivalent to the lambda expression below
        // the example with the 2 parameters value
        int c = 100;
        int d = 77;
        //can use a local variable if it's not going to change - effectively a final value

        Runner4 run4 = new Runner4();
        run4.runAnotherOne(new Executable4() {
            public int execute(int a, int b) {
                //can do this in methods as this is a LOCAL variable in this scope int d = 8;
                return a + b + c;
            }
        });
        System.out.println("----------------------------");

        //instead you can just write
        run4.runAnotherOne((a, b)-> {
            System.out.println("example 4 bit of text");
            //can't put a new variable of same name in there as lambda uses the whole scope of method int d = 2;
            return 7 + a + b + c;
        });

//****************************************************************************
       // Assign a lambda expression to a bit of code
        Executable4 ex = (a,b) ->{
            System.out.println("example 4 bit of text");
            //can't put a new variable of same name in there as lambda uses the whole scope of method int d = 2;
            return 7 + a + b + c;
        };

        //then pass the code as an argument
        run4.runAnotherOne(ex);


        // Assign a lambda expression to a bit of code
        Object codeblock = (Executable4) (a,b) ->{
            System.out.println("example 4 bit of text");
            //can't put a new variable of same name in there as lambda uses the whole scope of method int d = 2;
            return 7 + a + b + c;
        };
    }
}
