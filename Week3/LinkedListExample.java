import java.util.LinkedList;

public class LinkedListExample {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
    list.add("B");
    list.add("C");
    list.addFirst("A");
    list.addLast("D");
    System.out.println(list);
    System.out.println(list.getFirst());
    System.out.println(list.getLast());

    list.removeFirst();
    list.removeLast();
    System.out.println(list);
    System.out.println(list.get(0));
  }
}
