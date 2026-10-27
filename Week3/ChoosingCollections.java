import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ChoosingCollections {
  public static void main(String[] args) {
    List<String> names = new ArrayList<String>();
    names.add("A");
    names.add("A");
    names.add("B");

    Set<String> uniq = new HashSet<String>();
    uniq.add("A");
    uniq.add("A");
    uniq.add("B");

    Map<String, Integer> marks = new HashMap<String, Integer>();
    marks.put("A", 90);
    marks.put("B", 80);

    System.out.println(names);
    System.out.println(uniq);
    System.out.println(marks);
    System.out.println(names.get(1));

    List<String> orderList = new LinkedList<String>();
    Set<String> orderSet = new LinkedHashSet<String>();
    Map<String, Integer> orderMap = new LinkedHashMap<String, Integer>();

    orderList.add("one");
    orderSet.add("one");
    orderMap.put("one", 1);
    orderList.add("two");
    orderSet.add("two");
    orderMap.put("two", 2);

    System.out.println(orderList);
    System.out.println(orderSet);
    System.out.println(orderMap);
  }
}
