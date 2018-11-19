/**
 * a method may use a vararg parameter (variable argument) as if it is an array.
 * It is a little different than an array, though. A vararg parameter must be the last element in a method's parameter list.
 * This implies you are only allowed to have one vararg parameter per method.
 */
package uCertify;

public class _4_2_Varargs {

    public static void walk(int start, int...nums){
        System.out.println(nums.length);
    }


    public static void main(String[] args){

        /**
         * When calling a method with a vararg parameter, you have a choice. You can pass in an array,
         * or you can list the elements of the array and let Java create it for you. You can even omit
         * the vararg values in the method call and Java will create an array of length zero for you.
         */
        //outputs 0 - passes 1 as start but nothing else. This means Java creates an array of length 0 for nums
        walk(1);

        // passes 1 as start and one more value. Java converts this one value to an array of length 1
        walk(1, 2);

        //passes 1 as start and two more values. Java converts these two values to an array of length 2.
        walk(1,2,3);

        // passes 1 as start and an array of length 2 directly as nums.
        walk(1, new int[]{
                4,
                5
        });

    }
}
