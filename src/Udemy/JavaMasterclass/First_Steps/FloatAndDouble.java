package Udemy.JavaMasterclass.First_Steps;

public class FloatAndDouble {

    public static void main(String[] args) {

        //FLOAT
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float Min: " + myMinFloatValue);
        System.out.println("Float Max: " + myMaxFloatValue);
        System.out.println("BUSTED Max: " + (myMaxFloatValue + 1));

        //DOUBLE
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double Min: " + myMinDoubleValue);
        System.out.println("Double Max: " + myMaxDoubleValue);


        int myIntValue = 5 / 3;
        float myFloatValue =  5f / 3f; //add f to the end
        double myDoubleValue = 5d / 3d; //add d ot the end

        System.out.println("My Integer + " + myIntValue);
        System.out.println("My Float + " + myFloatValue);
        System.out.println("My Double + " + myDoubleValue);

    }
}
