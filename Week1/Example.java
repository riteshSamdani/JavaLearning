public class Example {

  static void step() {
    System.out.println("step called");
  }

  public static void main(String[] args) {
    System.out.println("main start");
    int a = 10;
    System.out.println(a);
    step();
    a = a + 5;
    System.out.println(a);
    System.out.println("main end");
  }
}
