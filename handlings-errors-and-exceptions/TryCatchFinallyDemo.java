//1.when the exception is handled
// class TryCatchFinallyDemo {
//     public static void main(String[] args) {
//         try {
//             int a = 100 , b = 0 , c;
//             c = a/b;
//             System.out.println(c);
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//         finally {
//             System.out.println("this is a finally statement");
//         }
//     }
// }


//2.when the exception is not handled. this program requires multiple catch 
class TryCatchFinallyDemo {
    public static void main(String[] args) {
        try {
            int a[] = {2,4,6,8};
            a[6] = 10/0;
            System.out.println(a[6]);
        } catch (ArrayIndexOutOfBoundsException ai) {
            System.out.println(ai);
        }

        finally {
            System.out.println("this is a finally statement");
        }
    }
}

