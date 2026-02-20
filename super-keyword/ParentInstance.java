//super keyword can be used to refer to parent class instane variable

class ParentInstance {
    int i = 10;
}

class Child extends ParentInstance {
    int i = 20;
    void show(int i) {
        System.out.println(super.i);  
    }

    public static void main(String[] args) {
        Child ob = new Child();
        ob.show(30);
    }
}