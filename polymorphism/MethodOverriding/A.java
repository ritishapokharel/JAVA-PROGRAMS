//here the arguments should be same unlike methodoverloading and class should be different (concept of inheritance is important)

class A {
    void msg () {
        System.out.println("A message method");
    }
}

class B extends A {
    void msg () {
        System.out.println("B message method");
    }
    public static void main(String[] args) {
        B b = new B();
        b.msg();
    }
}

