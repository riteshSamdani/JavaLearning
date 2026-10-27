import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListSetMap {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    list.add("A");
    list.add("B");
    list.add("A");

    Set<String> set = new HashSet<String>();
    set.add("A");
    set.add("B");
    set.add("A");

    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("A", 10);
    map.put("B", 20);
    map.put("A", 99);

    System.out.println(list);
    System.out.println(list.get(2));
    System.out.println(set);
    System.out.println(set.contains("A"));
    System.out.println(map);
    System.out.println(map.get("A"));
  }
}
