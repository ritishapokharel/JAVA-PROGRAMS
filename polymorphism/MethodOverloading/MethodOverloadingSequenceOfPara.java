class MethodOverloadingSequenceOfPara {
    void show(int id , String name) {
        System.out.println("1");    
    }

    void show (String name , int id){
        System.out.println("2");
    }

    public static void main(String[] args) {
        MethodOverloadingSequenceOfPara m = new MethodOverloadingSequenceOfPara();
        m.show(1,"ritisha"); //prints the first method as it is in the order of id first and name second as given the para in the method

    }
}