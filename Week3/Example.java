import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Example {

  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<Integer>();
    nums.add(10);
    nums.add(20);
    nums.add(30);
    nums.remove(1);
    System.out.println(nums);
    nums.remove(Integer.valueOf(30));
    System.out.println(nums);

    Set<Integer> set = new HashSet<Integer>();
    System.out.println(set.add(10));
    System.out.println(set.add(10));

    Map<String, Integer> map = new HashMap<String, Integer>();
    System.out.println(map.put("A", 10));
    System.out.println(map.put("A", 20));

    Person p1 = new Person("ram");
    Person p2 = new Person("ram");
    System.out.println(p1 == p2);
    System.out.println(p1.equals(p2));
    System.out.println(p1.hashCode() == p2.hashCode());

    Set<Person> people = new HashSet<Person>();
    people.add(p1);
    people.add(p2);
    System.out.println(people.size());

    Map<String, Integer> nullable = new HashMap<String, Integer>();
    nullable.put("A", null);
    System.out.println(nullable.get("A"));
    System.out.println(nullable.get("B"));
    System.out.println(nullable.containsKey("A"));
    System.out.println(nullable.containsKey("B"));
  }
}

class Person {
  String nm;

  Person(String nm) { this.nm = nm; }

  public boolean equals(Object o) {
    if (!(o instanceof Person))
      return false;
    Person p = (Person)o;
    return nm.equals(p.nm);
  }

  public int hashCode() { return nm.hashCode(); }

  public String toString() { return nm; }
}
