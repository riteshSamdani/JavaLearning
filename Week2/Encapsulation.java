public class Encapsulation {

  public static void main(String[] args) {
    Acc a = new Acc(1000);
    System.out.println(a.getBal());
    a.deposit(500);
    System.out.println(a.getBal());
    a.withdraw(300);
    System.out.println(a.getBal());
    a.withdraw(5000);
    System.out.println(a.getBal());
    a.deposit(-10);
  }
}

class Acc {
  private double bal;

  public Acc(double start) {
    if (start < 0) {
      System.out.println("bad start");
      bal = 0;
    } else {
      bal = start;
    }
  }

  public double getBal() {
    return bal;
  }

  public void deposit(double amt) {
    if (amt <= 0) {
      System.out.println("bad deposit");
      return;
    }
    bal = bal + amt;
  }

  public void withdraw(double amt) {
    if (amt <= 0) {
      System.out.println("bad withdraw");
      return;
    }
    if (amt > bal) {
      System.out.println("low bal");
      return;
    }
    bal = bal - amt;
  }
}
