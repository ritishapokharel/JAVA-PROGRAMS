//super keyword can be used to invoke parent class method 

class InvokeParentClass {
    void m1() {
        System.out.println("I am the parent");
    }
}
    class B extends InvokeParentClass {

        void m1() {
            System.out.println("I am in class B");
        }
        void show() {
            super.m1();
        }   

        public static void main(String[] args) {
            B ob = new B();
            ob.show();
        }
    }
