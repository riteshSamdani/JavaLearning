public class AbstractionAndInterfaces {

  public static void main(String[] args) {
    Rectangle r = new Rectangle(4, 5);
    r.label();
    r.show();
    r.line();
    System.out.println(r.area());

    Shape s = r;
    System.out.println(s.area());
    Printable p = r;
    p.show();
  }
}

abstract class Shape {
  String nm;

  Shape(String nm) { this.nm = nm; }

  abstract double area();

  void label() { System.out.println(nm); }
}

interface Printable {
  void show();

  default void line() { System.out.println("---"); }
}

class Rectangle extends Shape implements Printable {
  int w;
  int h;

  Rectangle(int w, int h) {
    super("rectangle");
    this.w = w;
    this.h = h;
  }

  double area() { return w * h; }

  public void show() { System.out.println(nm + " " + area()); }
}
