//2. Multilevel Inheritance

class Person {
    void showName() {
        System.out.println("I am a person");
    }
}

class Student extends Person {
    void study () {
        System.out.println("I am studying");
    }
}

class CollegeStudent extends Student {
    void collegeInfo() {
        System.out.println("I am in a college");
    }
    public static void main(String[] args) {
        CollegeStudent c = new CollegeStudent();
        c.showName();
        c.study();
        c.collegeInfo();
    }
}

