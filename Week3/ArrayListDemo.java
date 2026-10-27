import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<Integer>();
    nums.add(10);
    nums.add(20);
    nums.add(30);
    System.out.println("List: " + nums);
    System.out.println(nums);

    nums.add(1, 15);
    System.out.println("List: " + nums);
    System.out.println(nums.get(2));

    nums.set(2, 99);
    System.out.println("List: " + nums);
    System.out.println(nums.contains(30));
    System.out.println(nums.indexOf(30));

    nums.remove(1);
    System.out.println("List: " + nums);

    nums.remove(Integer.valueOf(30));
    System.out.println("List: " + nums);
    System.out.println(nums.size());
    System.out.println(nums.isEmpty());
  }
}
