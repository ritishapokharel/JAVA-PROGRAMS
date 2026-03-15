
public class WrapperExample {
    public static void main(String[] args) {
        //Converting int into integer
        int a = 20;
        Integer i = Integer.valueOf(a);
        Integer j = a; //autoboxing , now compiler will write Integer.valueOf(a) internally

        System.out.println(a+""+i+""+j);
    }
}
