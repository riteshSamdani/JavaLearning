public class ClassesAndObjects {

  public static void main(String[] args) {
    Car c1 = new Car();
    Car c2 = new Car();

    c1.brand = "toyota";
    c1.yr = 2020;

    c2.brand = "honda";
    c2.yr = 2021;

    c1.show();
    c2.show();

    System.out.println(c1 == c2);

    Car c3 = c1;
    System.out.println(c1 == c3);
    c3.yr = 2030;
    System.out.println(c1.yr);
  }
}

class Car {
  String brand;
  int yr;

  void show() {
    System.out.println(brand);
    System.out.println(yr);
  }
}
