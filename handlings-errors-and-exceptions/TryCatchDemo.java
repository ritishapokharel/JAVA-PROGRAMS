//if we dont know the type of exception , just type out Exception only as it is the parent class of every exceptions


class TryCatchDemo {
    public static void main(String[] args) {
        try {
            int a = 100 , b = 0 , c;
            c = a/b;
            System.out.println(c);
        }
         catch (Exception e)
          { 
            System.out.println(e); //prints the exception
        }
    }
}