public class ArrayTraversal {
  public static void main(String[] args) {
    int[] a = new int[4];
    int[] b = {10, 20, 30, 40};
    int[] c = new int[] {5, 15, 25};

    System.out.println(a.length);
    System.out.println(b.length);
    System.out.println(c.length);

    int i = 0;
    while (i < b.length) {
      System.out.println(i + " " + b[i]);
      i++;
    }

    for (int v : b) {
      System.out.println(v);
    }

    for (int v : b) {
      v = 999;
    }

    for (int v : b) {
      System.out.println("same as before " + v);
    }
    i = 0;
    while (i < b.length) {
      b[i] = 999;
      i++;
    }

    for (int v : b) {
      System.out.println("changed " + v);
    }

    int[][] grid = {{1, 2, 3}, {4, 5}, {6}};
    int r, col;
    for (r = 0; r < grid.length; r++) {
      for (col = 0; col < grid[r].length; col++) {
        System.out.print(grid[r][col] + " ");
      }
      System.out.println();
    }
  }
}
