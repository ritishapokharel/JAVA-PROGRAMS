//1.Single Inheritance

class Animal {
    int leg = 4;
    int tail = 1;
}
class Camel extends Animal {
    int hump = 1;
    public static void main(String[] args) {
        Camel c = new Camel();
        System.out.println(c.leg);
        System.out.println(c.tail);
         System.out.println(c.hump);
    }
}