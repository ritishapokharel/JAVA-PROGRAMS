//it is an unchecked exception which occurs at runtime. it cannot be checked by the compiler.
//Arithmetic Exception occurs when any number is divided by 0

class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        int a = 10/0;
        System.out.println(a);
    }
}