public class ArrayProblem {

  int find(int[] a, int x) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] == x)
        return i;
    }
    return -1;
  }

  int evens(int[] a) {
    int count = 0;
    int i = 0;
    while (i < a.length) {
      if (a[i] % 2 == 0)
        count++;
      i++;
    }
    return count;
  }

  boolean sorted(int[] a) {
    for (int i = 1; i < a.length; i++) {
      if (a[i] < a[i - 1])
        return false;
    }
    return true;
  }

  void rev(int[] a) {
    int l = 0, r = a.length - 1;
    while (l < r) {
      int t = a[l];
      a[l] = a[r];
      a[r] = t;
      l++;
      r--;
    }
  }

  int second(int[] a) {
    int big = a[0];
    int sec = a[0];
    boolean got = false;
    for (int i = 1; i < a.length; i++) {
      if (a[i] > big) {
        sec = big;
        big = a[i];
        got = true;
      } else if (a[i] < big) {
        if (!got || a[i] > sec) {
          sec = a[i];
          got = true;
        }
      }
    }
    if (!got)
      return -1;
    return sec;
  }

  public static void main(String[] args) {
    int[] data = {10, 5, 30, 5, 20};
    ArrayProblem a = new ArrayProblem();
    System.out.println(a.find(data, 30));
    System.out.println(a.find(data, 99));
    System.out.println(a.evens(data));
    System.out.println(a.sorted(data));
    System.out.println(a.second(data));

    a.rev(data);
    for (int v : data)
      System.out.print(v + " ");
    System.out.println();

    int[] same = {4, 4, 4};
    System.out.println(a.second(same));
  }
}
