abstract class Vehicle {
    abstract void start(); //--if a method doesnt have body add abstract to it and if a method has abstract the class must have abstract too. but if the class have abstract and the method doesnt , it is not compulsory for the method to have abstract
}

class Car extends Vehicle {
    void start() {
        System.out.println("car starts with key");
    }
}

class Scooter extends Vehicle {
     void start () {
        System.out.println("Scooter starts with kick");
     }

     public static void main(String[] args) {
        //  Vehicle v = new Vehicle(); -- not allowed

        Car c = new Car();
        c.start();

        Scooter s = new Scooter();
        s.start();
     }
}