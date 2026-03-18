import java.util.*;
class ArrayListDemo {
public static void main(String args[])  {
ArrayList<String> list = new ArrayList<String>(); //Creating arraylist
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
//Traversing list through iterator
Iterator itr = list.iterator();
while(itr.hasNext()) {
System.out.println(itr.next());
        }
    }
}