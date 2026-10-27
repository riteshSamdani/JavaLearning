public class AccessModifiers {

  public static void main(String[] args) {
    Base b = new Base();
    Kid k = new Kid();
    b.inside();
    k.fromKid();
    System.out.println(b.pub);
    System.out.println(b.prot);
    System.out.println(b.pack);
  }
}
class Base {
  public int pub = 1;
  protected int prot = 2;
  int pack = 3;
  private int priv = 4;
  public void pubM() { System.out.println("pub"); }

  protected void protM() { System.out.println("prot"); }

  void packM() { System.out.println("pack"); }

  private void privM() { System.out.println("priv"); }

  void inside() {
    System.out.println(pub);
    System.out.println(prot);
    System.out.println(pack);
    System.out.println(priv);
    pubM();
    protM();
    packM();
    privM();
  }
}

class Kid extends Base {
  void fromKid() {
    System.out.println(pub);
    System.out.println(prot);
    System.out.println(pack);
    pubM();
    protM();
    packM();
  }
}
