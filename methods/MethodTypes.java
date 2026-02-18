class MethodTypes {
    int a = 10; //instance variable
    static int b = 20; //static variable
    public static void main(String[] args) {
        MethodTypes r = new MethodTypes();
        r.Disp(); //non-static needs a object to run
        MethodTypes.Show(); //static can be acccessed w class name
    }
    static void Show() {
        System.out.println("Show():"+b);  //can only access the static variable  
    }

    void Disp() {
        System.out.println("Disp():"+a+""+b);  //can access both the instance and static variable
    }
}