class Phone {
    void showTime() {
        System.out.println("Time is 8 am");
    }

    void on() {
        System.out.println("Turning on phone....");
    }
}

class SmartPhone extends Phone {
    void music () {
        System.out.println("Playing music...");
    }

    void on() {
        System.out.println("Turning on SmartPhone...");
    }

    public static void main(String[] args) {
        Phone obj = new SmartPhone();
        obj.showTime();
        obj.on ();
        //obj.music() -- not allowed
    }
} 