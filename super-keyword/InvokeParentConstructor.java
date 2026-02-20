//super keyword can be used to invoke immediate parent class constructor

class InvokeParentConstructor {
    InvokeParentConstructor() {
        System.out.println("I am Parent");
    }
}

class Second extends InvokeParentConstructor {
    Second() {
        super(); //compiler puts the keyword by itself even if we dont put it 
        System.out.println("I am child");
    }

    public static void main(String[] args) {
        Second s = new Second();
    }
}