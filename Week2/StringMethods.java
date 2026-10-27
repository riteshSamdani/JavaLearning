public class StringMethods {
  public static void main(String[] args) {
    String text = "  Java Programming  ";
    System.out.println(text);
    System.out.println(text.length());
    System.out.println(text.charAt(2));
    System.out.println(text.toUpperCase());
    System.out.println(text.toLowerCase());
    System.out.println(text.contains("Java"));
    System.out.println(text.indexOf("Java"));
    System.out.println(text.lastIndexOf('a'));
    System.out.println(text.startsWith("  "));
    System.out.println(text.endsWith("  "));
    System.out.println(text.substring(2, 6));
    System.out.println("java".equals("Java"));
    System.out.println("java".equalsIgnoreCase("Java"));
    System.out.println("apple".compareTo("banana"));
    System.out.println(text.replace("Java", "Core"));
    System.out.println(text.trim());

    String csv = "red,green,blue";
    String[] parts = csv.split(",");
    int i;
    for (i = 0; i < parts.length; i++) {
      System.out.println(parts[i]);
    }

    System.out.println("".isEmpty());
    String spaces = "   ";
    System.out.println(spaces.trim().isEmpty());
  }
}
