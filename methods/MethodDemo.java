class MethodDemo {
    public static void main(String[] args) {
        MethodDemo r = new MethodDemo();
        r.add();
        r.disp();
    }
    public static void add() {
        int a = 10;
        int b = 10;
        System.out.println(a+b);
    }
    public static void disp() {
        System.out.println("Hello world");
    }
}