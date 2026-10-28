public class ReversingALinkedList {

  Node rev(Node head) {
    Node prev = null;
    Node cur = head;
    while (cur != null) {
      Node nxt = cur.next;
      cur.next = prev;
      prev = cur;
      cur = nxt;
    }
    return prev;
  }

  void show(Node head) {
    Node cur = head;
    while (cur != null) {
      System.out.print(cur.data + " -> ");
      cur = cur.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    ReversingALinkedList obj = new ReversingALinkedList();
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    head.next.next.next = new Node(40);

    obj.show(head);
    head = obj.rev(head);
    obj.show(head);
  }
}

class Node {
  int data;
  Node next;

  Node(int data) { this.data = data; }
}
