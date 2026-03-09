class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int a[] = {1,2,3,4};
            int b = 0;
            a[6] = 10/0;
            System.out.println(a[6]);
        } catch (ArithmeticException ai) {
            System.out.println(ai);
        }

        catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println(ae);
        }


        catch (Exception e) {
            System.out.println(e);
        }
    }
}