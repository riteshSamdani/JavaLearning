public class ArraysBasics {
  public static void main(String[] args) {
    int[] nums;
    nums = new int[5];

    int i = 0;
    while (i < nums.length) {
      System.out.println(nums[i]);
      i++;
    }

    nums[0] = 10;
    nums[1] = 20;
    nums[2] = 30;

    i = 0;
    while (i < nums.length) {
      System.out.println(i + " " + nums[i]);
      i++;
    }

    System.out.println(nums.length);

    int[] b = nums;
    b[0] = 999;
    System.out.println(nums[0]);

    int[] nothing = null;
    if (nothing == null) {
      System.out.println("null");
    }
  }
}
