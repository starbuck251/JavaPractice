package uCertify.Class_Inheritance;

public class _5_1_Lion extends _5_1_Animal {
    private void roar (){
        setAge(5);
        System.out.println("The " +getAge() + " year old lion says: Roar!");
        // the parents private age variable cannot be accessed here

    }
    public void dog (){
        System.out.println("Dog");
    }
    public static void main (String args[]){
        _5_1_Lion obj = new _5_1_Lion();

        obj.roar();
        obj.dog();
        obj.cat();
    }
}

