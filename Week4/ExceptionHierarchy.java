public class ExceptionHierarchy {
  public static void main(String[] args) {
    System.out.println("Throwable");
    System.out.println("Error");
    System.out.println("Exception");
    System.out.println("RuntimeException");

    Throwable t1 = new Exception("checked");
    Throwable t2 = new RuntimeException("runtime");
    Throwable t3 = new Error("err");
    System.out.println(t1.getClass().getName());
    System.out.println(t2.getClass().getName());
    System.out.println(t3.getClass().getName());

    System.out.println(t2 instanceof Exception);
    System.out.println(t2 instanceof RuntimeException);
    System.out.println(t1 instanceof RuntimeException);
  }
}
