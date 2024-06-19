import java.util.Arrays;

public class DataTypes {
  public static void main(String[] args) {
    int x = 10;
    int y = x;
    System.out.println("Initially: " + x + " " + y);
    y = 11;
    System.out.println("After " + x + " " + y);

    System.out.println("Non Primitives");
    int[] arr = { 1, 2, 3, 4, 5 };
    int[] brr = arr;
    System.out.println("Initially " + Arrays.toString(arr) + " " + Arrays.toString(brr));
    brr[1] = 10;
    System.out.println("After " + Arrays.toString(arr) + " " + Arrays.toString(brr));
  }
}
