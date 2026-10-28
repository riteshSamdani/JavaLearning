public class CustomExceptions {
  public static void main(String[] args) {
    Acc a = new Acc("A100", 1000);
    try {
      a.withdraw(1500);
    } catch (LowBal e) {
      System.out.println(e.getMessage());
    }

    try {
      new Acc("", 100);
    } catch (BadAcc e) {
      System.out.println(e.getMessage());
    }
  }
}

class LowBal extends Exception {
  LowBal(String msg) { super(msg); }
}

class BadAcc extends RuntimeException {
  BadAcc(String msg) { super(msg); }
}

class Acc {
  String no;
  double bal;

  Acc(String no, double start) {
    if (no == null || no.length() == 0)
      throw new BadAcc("invalid account number");
    if (start < 0)
      throw new IllegalArgumentException("negative balance");
    this.no = no;
    this.bal = start;
  }

  void withdraw(double amt) throws LowBal {
    if (amt <= 0)
      throw new IllegalArgumentException("invalid amount");
    if (amt > bal)
      throw new LowBal("low balance in account " + no);
    bal = bal - amt;
  }
}
