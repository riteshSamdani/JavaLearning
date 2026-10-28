// Top-level class (cannot use 'static' or 'private' modifier here)

public class NodesAndReferences {
  public static void main(String[] args) {
    Node n1 = new Node(10);
    Node n2 = new Node(20);
    Node n3 = new Node(30);

    n1.next = n2;
    n2.next = n3;

    System.out.println(n1.data);
    System.out.println(n1.next.data);
    System.out.println(n2.next.data);
    System.out.println(n3.next);

    Node other = n1;
    other.data = 100;
    System.out.println(n1.data);
  }
}

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}