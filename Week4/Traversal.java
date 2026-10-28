public class Traversal {

  static class Node {
    int data;
    Node next;

    Node(int data) { this.data = data; }
  }

  static void show(Node head) {
    Node cur = head;
    while (cur != null) {
      System.out.println(cur.data);
      cur = cur.next;
    }
  }

  static int count(Node head) {
    int c = 0;
    Node cur = head;
    while (cur != null) {
      c++;
      cur = cur.next;
    }
    return c;
  }

  static int total(Node head) {
    int s = 0;
    Node cur = head;
    while (cur != null) {
      s = s + cur.data;
      cur = cur.next;
    }
    return s;
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    head.next.next.next = new Node(40);
    show(head);
    System.out.println(count(head));
    System.out.println(total(head));
  }
}
