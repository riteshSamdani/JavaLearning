public class ThisKeyword {

  public static void main(String[] args) {
    User u = new User("ritesh", 24);
    u.show();
    u.setAge(25);
    u.show();
    u.callShow();
  }
}

class User {
  String nm;
  int age;

  User(String nm, int age) {
    this.nm = nm;
    this.age = age;
  }

  void setAge(int age) {
    this.age = age;
  }

  void show() {
    System.out.println(this.nm);
    System.out.println(this.age);
  }

  void callShow() {
    this.show();
  }
}
