/* encapsulation in java is a mechanism of wrapping the data(variables) and code acting on the data(methods) together as a single unit.

steps to achieve encapsulation:
1.Declare the variable of a class as private
2.Provide public setter and getter methods to modify and view the variables values.  */

class Employee {
    private int empid;
    public void setEmpid(int eid) {
         empid = eid;
    }

    public int getEmpid() {
        return empid;
    }
}

class Company {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpid(101);
        System.out.println(e.getEmpid());
    }
}