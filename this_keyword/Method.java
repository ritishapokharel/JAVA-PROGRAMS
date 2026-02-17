package this_keyword;

public class Method {
    public void msg() {
        System.out.println("msg.method");
    }
    public void display() {
        this.msg();
    }
    public static void main(String[] args) {
        Method d = new Method();
        d.display();
    }
}
