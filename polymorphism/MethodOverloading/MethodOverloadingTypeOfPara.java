class MethodOverloadingTypeOfPara {
     void show (int a) {
        System.out.println(a);
     }

     void show (String c) {
        System.out.println(c);
     }

     public static void main(String[] args) {
         MethodOverloadingTypeOfPara m = new MethodOverloadingTypeOfPara();
         m.show(1);
         m.show("ritisha");
     }
}