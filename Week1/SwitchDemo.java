public class SwitchDemo {
  public static void main(String[] args) {
    int day = 3;
    System.out.println("day: " + day);
    switch (day) {
      case 1:
        System.out.println("mon");
        break;
      case 2:
        System.out.println("tue");
        break;
      case 3:
        System.out.println("wed");
        break;
      default:
        System.out.println("other");
    }

    int year = 2026;
    System.out.println("year: " + year);
    switch (year % 4) {
      case 0:
        System.out.println("leap year");
        break;
      default:
        System.out.println("not a leap year");
    }
  }
}
