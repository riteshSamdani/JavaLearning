public class Constructors {

  public static void main(String[] args) {
    Emp e1 = new Emp();
    Emp e2 = new Emp("ritesh", 50000);
    Emp e3 = new Emp("ronak");
    e1.show();
    e2.show();
    e3.show();
  }
}

class Emp {
  String nm;
  int pay;

  Emp() {
    nm = "none";
    pay = 0;
    System.out.println("no args");
  }

  Emp(String nm, int pay) {
    this.nm = nm;
    this.pay = pay;
    System.out.println("two args");
  }

  Emp(String nm) {
    this(nm, 0);
    System.out.println("one arg");
  }

  void show() { System.out.println(nm + " " + pay); }
}