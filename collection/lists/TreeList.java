import java.util.*;
public class TreeList {
public static void main(String[] args) {
TreeSet<String> set = new TreeSet<String>();
set.add("Ritisha");
set.add("Bibisha");
set.add("Pokharel");
set.add("Kharel");
Iterator<String> itr = set.iterator();
while(itr.hasNext()) {
System.out.println(itr.next());
        }
    }
}