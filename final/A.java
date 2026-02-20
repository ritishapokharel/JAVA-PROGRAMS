//final keyword is used in variable , class and method.
// 1. when we want the variable to be constant(cant change the value)
//2. when we create any final method, we cannot override it
//3. if we create any final class, we cannot extend it or inherit it

class A {
    public static void main(String[] args) {
        final int i = 10;
        // i = i+20; compiler gives error as the value cannot be changed
        System.out.println(i);
    }
}