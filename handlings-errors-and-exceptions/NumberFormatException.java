//this type of exceptions occur when we try to convert the data types that are incompatible with each other

class NumberFormatException {
    public static void main(String[] args) {
        String s = "Ritisha";
        int a = Integer.parseInt(s);
        System.out.println(a);
    }
}