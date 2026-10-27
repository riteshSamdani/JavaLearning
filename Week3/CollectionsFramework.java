import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsFramework {
  public static void main(String[] args) {
    Collection<String> bag = new ArrayList<String>();
    bag.add("java");
    bag.add("c++");

    List<String> list = new ArrayList<String>();
    list.add("java");
    list.add("java");

    Set<String> set = new HashSet<String>();
    set.add("java");
    set.add("java");

    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("java", 10);
    map.put("c++", 8);

    System.out.println(bag);
    System.out.println(list);
    System.out.println(set);
    System.out.println(map);
  }
}
