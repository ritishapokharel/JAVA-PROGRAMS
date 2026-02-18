package variables;

public class Demo {
    static int b = 20; //static variable
    int c = 10; //instance variable
    public static void main(String[] args) {
        int a = 10; //local variable
        Demo ref = new Demo();
        System.out.println(a); //prints local
        System.out.println(Demo.b); //prints static
        System.out.println(ref.c); //prints instance

    }
}
