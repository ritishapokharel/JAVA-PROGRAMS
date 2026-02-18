import java.util.Scanner;
class UseOfMethod {
    int n1,n2;
    int add,sub,mul,div,rem;
    public static void main(String[] args) {
        UseOfMethod s = new UseOfMethod();
        s.input();
        s.process();
        s.output();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
    }

    void process () {
        add = n1+n2;
        sub = n1 - n2;
        mul = n1*n2;
        div = n1/n2;
        rem = n1%n2;
    }

    void output() {
        System.out.println("Addition is :"+add);
        System.out.println("Subtraction is :"+sub);
        System.out.println("Multiplication is :"+mul);
        System.out.println("Division is :"+div);
        System.out.println("Reminder is :"+rem);
        
    }
}