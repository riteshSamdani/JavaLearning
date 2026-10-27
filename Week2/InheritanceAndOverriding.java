public class InheritanceAndOverriding {

  public static void main(String[] args) {
    Dog d = new Dog("tom");
    Cat c = new Cat("milo");
    d.sound();
    c.sound();
    d.eat();
    d.fetch();

    Animal a = new Dog("rocky");
    a.sound();
    a.eat();
  }
}

class Animal {
  protected String nm;

  Animal(String nm) { this.nm = nm; }

  void sound() { System.out.println("animal"); }

  void eat() { System.out.println(nm + " eat"); }
}

class Dog extends Animal {
  Dog(String nm) { super(nm); }

  void sound() { System.out.println(nm + " woof"); }

  void fetch() { System.out.println(nm + " fetch"); }
}

class Cat extends Animal {
  Cat(String nm) { super(nm); }

  void sound() { System.out.println(nm + " meow"); }
}