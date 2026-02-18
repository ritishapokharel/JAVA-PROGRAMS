package constructors;

public class Parameterized {
    int id;
    String name;
    public Parameterized(int id,String name) {
        this.id = id;
        this.name = name;
    }
    public void display() {
        System.out.println(id + "\t" + name);
    }
    public static void main(String[] args) {
        Parameterized s1 = new Parameterized(1, "ritisha");
        Parameterized s2 = new Parameterized(2, "anmol");
        s1.display();
        s2.display();
    }
}
