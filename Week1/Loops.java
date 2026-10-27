public class Loops {
  public static void main(String[] args) {

    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }

    int i = 0;
    while (i < 5) {
      System.out.println("while " + i);
      i++;
    }

    int j = 0;
    do {
      System.out.println("do-while " + j);
      j++;
    } while (j < 5);

    int k = 10;
    do {
      System.out.println("do-while ran once");
    } while (k < 5);

    for (int x = 0; x < 10; x++) {
      if (x == 5) break;
      System.out.println("break " + x);
    }

    for (int x = 0; x < 6; x++) {
      if (x == 3) continue;
      System.out.println("continue " + x);
    }

    for (int x = 1; x < 20; x = x * 2) {
      System.out.println("power of 2 " + x);
    }
  }
}
