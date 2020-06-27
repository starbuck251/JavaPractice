public class Test {

    public void m(int a){
        System.out.println("in int");
    }

    public void m(char c){
        System.out.println("in char");
    }
    public static void main(String[] args) {
      Test t = new Test();
      int a = 'a';
      char c = 6;

      t.m(a);
      t.m(c);

    }
}
