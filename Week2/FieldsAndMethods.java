public class FieldsAndMethods {

  public static void main(String[] args) {
    Student s1 = new Student();
    System.out.println(s1.marks);
    System.out.println(Student.count);

    s1.nm = "a";
    s1.marks = 70;

    Student s2 = new Student();
    s2.nm = "b";
    s2.marks = 80;

    Student.count = 2;

    s1.show();
    s2.show();
    s1.addMarks(5);
    s1.show();
    s2.show();
    Student.showCount();
  }
}

class Student {
  String nm;
  int marks;
  static int count;

  void show() {
    System.out.println(nm + " " + marks);
  }

  void addMarks(int n) {
    marks = marks + n;
  }

  static void showCount() {
    System.out.println(count);
  }
}
