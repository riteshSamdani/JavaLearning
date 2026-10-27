public class TypeCasting {
  public static void main(String[] args) {
    int n = 100;
    long big = n;
    double d = big;
    System.out.println("int to long: " + big);
    System.out.println(d);

    int large = 130;
    byte small = (byte)large;
    System.out.println("int to byte: " + small);

    char ch = 'A';
    int code = ch;
    System.out.println("char to int: " + code);

    byte x = 10;
    byte y = 20;
    int sum = x + y;
    System.out.println("byte + byte to int: " + sum);

    byte z = 10;
    z += 1;
    System.out.println("byte += 1: " + z);

    double val = 9.8;
    int cut = (int)val;
    System.out.println("double to int: " + cut);
  }
}
