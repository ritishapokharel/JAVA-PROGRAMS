public class CharacterExtraction {

    public static void main(String[] args) {

        String s = "Hello";

        // 1️ charAt()
        System.out.println("Using charAt():");
        System.out.println("Character at index 1: " + s.charAt(1));
        System.out.println();

        // 2️ toCharArray()
        System.out.println("Using toCharArray():");
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            System.out.println(c);
        }
        System.out.println();

        // 3️ getBytes()
        System.out.println("Using getBytes():");
        byte[] byteArray = s.getBytes();
        for (byte b : byteArray) {
            System.out.println(b);
        }
        System.out.println();

        // 4 getChars()
        System.out.println("Using getChars():");
        char[] destination = new char[5];
        s.getChars(0, 5, destination, 0);

        for (char c : destination) {
            System.out.println(c);
        }
    }
}
