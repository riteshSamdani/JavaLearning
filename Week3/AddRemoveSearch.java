import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AddRemoveSearch {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>();
    list.add(10);
    list.add(20);
    list.add(30);
    System.out.println("List: " + list);
    System.out.println(list.get(1));
    System.out.println(list.contains(20));
    list.remove(1);
    System.out.println("List: " + list);

    Set<Integer> set = new HashSet<Integer>();
    System.out.println(set.add(10));
    System.out.println(set.add(10));
    System.out.println(set.contains(10));
    set.remove(10);
    System.out.println("Set: " + set);

    Map<String, Integer> map = new HashMap<String, Integer>();
    System.out.println(map.put("A", 1));
    System.out.println(map.put("A", 9));
    System.out.println(map.get("A"));
    System.out.println(map.containsKey("A"));
    System.out.println(map.remove("A"));
  }
}
