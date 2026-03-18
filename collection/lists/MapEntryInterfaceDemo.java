import java.util.*;
public class MapEntryInterfaceDemo {
public static void main(String[] args) {
Map<Integer,String> map = new HashMap<Integer,String>();
    map.put(103,"Ritisha");
    map.put(101,"Pokharel");
    map.put(102,"Pokharel");
//ELements traverse
for(Map.Entry m:map.entrySet()) {
System.out.println(m.getKey()+""+m.getValue());
    }
}
}