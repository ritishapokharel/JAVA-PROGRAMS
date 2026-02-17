package arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int a[] = {24,32,48,80,12,22,55,32,51};
        int i;
        for (i=a.length-1;i>=0;i--) {
            System.out.println(a[i]);
        }
    }
}
