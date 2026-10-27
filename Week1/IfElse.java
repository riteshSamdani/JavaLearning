public class IfElse {
  public static void main(String[] args) {
    int marks = 72;

  System.out.println("marks: " + marks);
  System.out.print("Grade: ");

    if (marks >= 90) {
      System.out.println("A+");
    } else if (marks >= 75) {
      System.out.println("A");
    } else if (marks >= 60) {
      System.out.println("B");
    } else if (marks >= 40) {
      System.out.println("C");
    } else {
      System.out.println("fail");
    }

    int age = 25;
    boolean hasId = true;

    if (age >= 18) {
      if (hasId) {
        System.out.println("eligible");
      } else {
        System.out.println("not eligible: need id");
      }
    } else {
      System.out.println("not eligible");
    }
  }
}
