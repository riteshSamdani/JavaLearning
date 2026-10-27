public class CharacterAndSubstringOperations {
  public static void main(String[] args) {
    String text = "Java";
    System.out.println(text.length());

    int i;
    for (i = 0; i < text.length(); i++) {
      char ch = text.charAt(i);
      System.out.println(i + " " + ch + " " + (int) ch);
    }

    System.out.println(text.substring(0, 1));
    System.out.println(text.substring(1, 3));
    System.out.println(text.substring(2));

    char c = 'G';
    System.out.println(Character.isLetter(c));
    System.out.println(Character.isDigit(c));
    System.out.println(Character.isUpperCase(c));
    System.out.println(Character.toLowerCase(c));

    String mix = "A1b2C3";
    int dig = 0;
    int let = 0;
    for (i = 0; i < mix.length(); i++) {
      char ch = mix.charAt(i);
      if (Character.isDigit(ch)) dig++;
      if (Character.isLetter(ch)) let++;
    }
    System.out.println(dig);
    System.out.println(let);
  }
}
