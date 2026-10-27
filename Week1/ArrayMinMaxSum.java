public class ArrayMinMaxSum {

  int total(int[] a) {
    int s = 0;
    int i = 0;

    while (i < a.length) {
      s = s + a[i];
      i++;
    }
    return s;
  }

  int smallest(int[] a) {
    int m = a[0];
    int i = 1;
    while (i < a.length) {
      if (a[i] < m)
        m = a[i];
      i++;
    }
    return m;
  }

  int biggest(int[] a) {
    int m = a[0];
    int i = 1;
    while (i < a.length) {
      if (a[i] > m)
        m = a[i];
      i++;
    }
    return m;
  }

  public static void main(String[] args) {
    int[] nums = {12, -5, 7, 3, -20, 9};
    ArrayMinMaxSum a = new ArrayMinMaxSum();
    System.out.println(a.total(nums));
    System.out.println(a.smallest(nums));
    System.out.println(a.biggest(nums));
  }
}
