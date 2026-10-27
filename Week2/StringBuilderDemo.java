public class StringBuilderDemo {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    System.out.println(sb.length());
    System.out.println(sb.capacity());

    sb.append("Java");
    sb.append(" ");
    sb.append("Week");
    sb.append(2);
    System.out.println(sb);

    sb.insert(5, "code ");
    System.out.println(sb);

    sb.delete(5, 10);
    System.out.println(sb);

    sb.replace(0, 4, "Core");
    System.out.println(sb);

    sb.setCharAt(0, 'J');
    System.out.println(sb);

    sb.reverse();
    System.out.println(sb);

    String s = sb.toString();
    System.out.println(s);
  }
}
