package uCertify;

public class _1_8_Variable_Scope {
    static int classVariable = 5;
    int instanceVariable = 10;

    public void doStuff (int local){
        System.out.println("local is available here only " + local);

        System.out.println("class variable can be access here  " + classVariable);
        System.out.println("instance variable can be access here " + instanceVariable);

    }

    public void main (String args []) {

     //   System.out.println("local is not accessible here  " + local);
        System.out.println("class variable can be access here  " + classVariable);
        System.out.println("instance variable can be access here " + instanceVariable);

        for (int i = 0; i <10; i++){
            System.out.println("i is avail here" + i);
        }

     //   System.out.println("i is not avail here" + i);

    }

}
