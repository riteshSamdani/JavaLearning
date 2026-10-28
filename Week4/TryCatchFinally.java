public class TryCatchFinally {

  void div(int n) {
    try {
      System.out.println("try");
      int r = 100 / n;
      System.out.println(r);
    } catch (ArithmeticException e) {
      System.out.println("catch");
      System.out.println(e.getClass().getSimpleName());
      System.out.println(e.getMessage());
    } finally {
      System.out.println("finally");
    }
    System.out.println("after");
  }

  void at(int idx) {
    int[] a = {10, 20, 30};
    try {
      System.out.println(a[idx]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("index");
    } catch (RuntimeException e) {
      System.out.println("runtime");
    }
  }

  public static void main(String[] args) {
    TryCatchFinally obj = new TryCatchFinally();
    obj.div(10);
    obj.div(0);
    obj.at(99);
  }
}
