import java.util.HashMap;
import java.util.Map;

public class MutableKey {

  public static void main(String[] args) {
    Key k = new Key("A");
    Map<Key, String> map = new HashMap<Key, String>();
    map.put(k, "dev");
    System.out.println(map.get(k));
    System.out.println(map.containsKey(k));

    k.id = "B";
    System.out.println(map.get(k));
    System.out.println(map.containsKey(k));
    System.out.println(map);
  }
}

class Key {
  String id;

  Key(String id) { this.id = id; }

  public boolean equals(Object o) {
    if (o == null || o.getClass() != Key.class)
      return false;
    Key k = (Key)o;
    return id.equals(k.id);
  }

  public int hashCode() { return id.hashCode(); }

  public String toString() { return id; }
}
