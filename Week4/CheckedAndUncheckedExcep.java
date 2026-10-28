import java.io.IOException;

public class CheckedAndUncheckedExcep {

  void checkedOne() throws IOException { throw new IOException("io"); }

  void uncheckedOne() { throw new IllegalArgumentException("bad"); }

  public static void main(String[] args) {
    CheckedAndUncheckedExcep obj = new CheckedAndUncheckedExcep();
    try {
      obj.checkedOne();
    } catch (IOException e) {
      System.out.println(e.getClass().getSimpleName());
    }

    try {
      obj.uncheckedOne();
    } catch (IllegalArgumentException e) {
      System.out.println(e.getClass().getSimpleName());
    }

    try {
      int n = Integer.parseInt("x");
      System.out.println(n);
    } catch (NumberFormatException e) {
      System.out.println(e.getClass().getSimpleName());
    }
  }
}
