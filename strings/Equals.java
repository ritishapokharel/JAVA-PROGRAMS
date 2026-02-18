class Equals {
    public static void main(String[] args) {
        String s1 = "ritisha";
        String s2 = "ritisha";
        String s3 = "pokharel";
        String s4 = "RITISHA";
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4));

    }
}