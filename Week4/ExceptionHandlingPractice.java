public class ExceptionHandlingPractice {

  int toAge(String s) {
    try {
      return Integer.parseInt(s);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException("not int " + s, e);
    }
  }

  void go(int n) {
    if (n < 0)
      throw new IllegalArgumentException("neg");
    System.out.println(n);
  }

  public static void main(String[] args) {
    ExceptionHandlingPractice obj = new ExceptionHandlingPractice();
    try {
      System.out.println(obj.toAge("twenty"));
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
      System.out.println(e.getCause().getClass().getSimpleName());
    }

    try {
      obj.go(-10);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    System.out.println(obj.toAge("21"));
  }
}
