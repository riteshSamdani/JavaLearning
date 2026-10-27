public class MethodsAndParameters {

  static int add(int a, int b) {
    return a + b;
  }

  static void show(String msg) {
    System.out.println(msg);
  }

  static void changeNum(int n) {
    n = 1000;
  }

  static void changeFirst(int[] a) {
    a[0] = 1000;
  }

  static void newArr(int[] a) {
    a = new int[] {7, 8, 9};
  }

  static int multiply(int a, int b) {
    return a * b;
  }

  static double multiply(double a, double b) {
    return a * b;
  }

  public static void main(String[] args) {
    int result = add(10, 20);
    System.out.println(result);
    show("hello");

    int x = 10;
    changeNum(x);
    System.out.println(x);

    int[] nums = {1, 2, 3};
    changeFirst(nums);
    System.out.println(nums[0]);

    newArr(nums);
    System.out.println(nums[0]);

    System.out.println(multiply(2, 3));
    System.out.println(multiply(2.5, 3.0));
  }
}
