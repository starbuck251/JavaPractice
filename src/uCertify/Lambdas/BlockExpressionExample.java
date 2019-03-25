package uCertify.Lambdas;

interface MyString{
    String myStringFunction(String str);
}


public class BlockExpressionExample {
    public static void main(String[] args) {
        //Block lambda to reverse string
        MyString reverseStr = (str) -> {
            String result = "";

            for(int i = str.length()-1; i>=0; i--)
                result += str.charAt(i);

            return result;
        };

        //output
        System.out.println(reverseStr.myStringFunction("Lambda Demo"));
    }


}
