package this_keyword;

public class InvokeConstructors {
    //no-argument constructor/non-parameterized constructor
    public InvokeConstructors() {
        System.out.println("A constructor");
    }
    //parameterized constructor-calls the no argument constructor
    public InvokeConstructors(int a) {
        this();
        System.out.println("");
    }
    public static void main(String[] args) {
        InvokeConstructors a = new InvokeConstructors(5);
    }
}
