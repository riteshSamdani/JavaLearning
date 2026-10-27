import java.util.HashSet;
import java.util.Set;

public class DuplicateDetection {

  boolean hasDup(int[] a) {
    Set<Integer> seen = new HashSet<Integer>();
    for (int i = 0; i < a.length; i++) {
      if (!seen.add(a[i]))
        return true;
    }
    return false;
  }

  Set<Integer> dups(int[] a) {
    Set<Integer> seen = new HashSet<Integer>();
    Set<Integer> rep = new HashSet<Integer>();
    int i;
    for (i = 0; i < a.length; i++) {
      if (!seen.add(a[i]))
        rep.add(a[i]);
    }
    return rep;
  }

  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4};
    int[] b = {1, 2, 3, 2, 5, 1};
    DuplicateDetection dd = new DuplicateDetection();
    System.out.println(dd.hasDup(a));
    System.out.println(dd.hasDup(b));
    System.out.println(dd.dups(b));
  }
}
