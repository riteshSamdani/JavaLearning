public class StringImmutability {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = s1;
    System.out.println(s1);
    System.out.println(s2);

    s1.concat(" Java");
    System.out.println(s1);

    s1 = s1.concat(" Java");
    System.out.println(s1);
    System.out.println(s2);

    String a = new String("Java");
    String b = new String("Java");
    System.out.println(a == b);
    System.out.println(a.equals(b));

    String p1 = "Java";
    String p2 = "Java";
    System.out.println(p1 == p2);

    String p3 = "Ja" + "va";
    System.out.println(p1 == p3);
  }
}
