public class Operators {
  public static void main(String[] args) {
    int a = 10;
    int b = 3;

    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);
    System.out.println(a % b);
    System.out.println(5 / 2);
    System.out.println(5 / 2.0);

    System.out.println(a > b);
    System.out.println(a <= b);
    System.out.println(a == b);
    System.out.println(a != b);

    System.out.println(true && false);
    System.out.println(true || false);
    System.out.println(!true);

    System.out.println(5 & 3);
    System.out.println(5 | 3);
    System.out.println(5 ^ 3);
    System.out.println(~5);
    System.out.println(5 << 1);
    System.out.println(5 >> 1);
    System.out.println(-8 >> 1);
    System.out.println(-8 >>> 1);

    int x = 5;
    System.out.println(x++);
    System.out.println(x);
    System.out.println(++x);

    a += 2;
    a *= 2;
    System.out.println(a);

    int zero = 0;
    if (zero != 0 && 10 / zero > 1) {
      System.out.println("no");
    } else {
      System.out.println("skipped div");
    }

    int m = (a > b) ? a : b;
    System.out.println(m);
  }
}
