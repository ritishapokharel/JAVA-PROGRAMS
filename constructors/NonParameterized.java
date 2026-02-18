package constructors;

public class NonParameterized {
    // Non-parameterized constructor (no arguments)
    public NonParameterized() {
        int id = 1;
        String name = "Ritisha";
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        // Creating objects using the non-parameterized constructor
        NonParameterized s1 = new NonParameterized();
        NonParameterized s2 = new NonParameterized();
    }
}
