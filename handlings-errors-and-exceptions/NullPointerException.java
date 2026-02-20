// this type of exception occurs only when we try to access the properties of object that has null value

class NullPointerException {
    public static void main(String[] args) {
        String s = null;
        int len = s.length();
        System.out.println(len);
    }
}