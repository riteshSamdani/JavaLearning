public class Polymorphism {
  void play(Animal a) { a.sound(); }

  public static void main(String[] args) {
    Animal a1 = new Dog();
    Animal a2 = new Cat();
    Polymorphism p = new Polymorphism();
    p.play(a1);
    p.play(a2);

    Animal a = new Dog();
    a.sound();

    Dog d = (Dog)a;
    d.fetch();
  }
}

class Animal {
  void sound() { System.out.println("animal"); }
}

class Dog extends Animal {
  void sound() { System.out.println("dog"); }
  void fetch() { System.out.println("fetch"); }
}

class Cat extends Animal {
  void sound() { System.out.println("cat"); }
}