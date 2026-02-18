class StringsMethods {
    public static void main(String[] args) {
        String a = "RITISHA";
        String b = "Pokharel";

        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());

        System.out.println(b.concat(a));
        System.out.println(b.length());


        String c = "     Cat    ";
        String d ="";
        System.out.println(c.trim()); //removes space
        System.out.println(d.isEmpty()); //whether the string is empty or not

        System.out.println(b.charAt(2)); //finds what is in the given index
        System.out.println(a.indexOf('S')); //finds the number of index of given string
        
        
    }
}