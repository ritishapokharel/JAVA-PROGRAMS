class MethodOverloadingNumberOfPara {
    void show(int a) {
        System.out.println(a);
    }

    void show (int a , int b) {
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        MethodOverloadingNumberOfPara m = new MethodOverloadingNumberOfPara();
        m.show(10);
        m.show(10+10);
    }
}

//it will print on the basis of number of parameter. if there was no para in m.show() it would print the first method- which shows 1