import java.io.IOException;

public class ThrowAndThrows {

  void checkAge(int age) {
    if (age < 18)
      throw new IllegalArgumentException("small");
    System.out.println("ok");
  }

  void read() throws IOException { throw new IOException("read fail"); }

  void callRead() throws Exception {
    try {
      read();
    } catch (IOException e) {
      throw new Exception("wrap", e);
    }
  }

  public static void main(String[] args) {
    ThrowAndThrows obj = new ThrowAndThrows();
    try {
      obj.checkAge(15);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    try {
      obj.callRead();
    } catch (Exception e) {
      System.out.println(e.getMessage());
      System.out.println(e.getCause().getClass().getSimpleName());
    }
  }
}
