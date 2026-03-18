import java.util.*;
public class SetInterfaceDemo {
    //Creating HashSet and adding elements
    public static void main(String[] args) {
          HashSet<String> set = new HashSet<String>();
    set.add("Ram");
    set.add("Hari");
    set.add("Ram");
    set.add("Ajay");
    //Traversing elements

    Iterator<String> itr = set.iterator();
    while(itr.hasNext()) {
        System.out.println(itr.next());
    }
    }
  
}
