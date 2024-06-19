import java.util.Scanner;

public class IoScanner {
  Scanner scn = new Scanner(System.in);

  void closeScanner() {
    this.scn.close();
  }

  void readVariousTypes() {

    // input one word
    String str1 = this.scn.next();

    System.out.println("Word: " + str1);

    // input entire line
    String str2 = this.scn.nextLine();

    System.out.println("Line: " + str2);

    // input integer

    int x = this.scn.nextInt();
    System.out.println("Integer" + x);

    // float
    float y = this.scn.nextFloat();
    System.out.println("Float" + y);

  }

  void sumInput() {
    int sum = 0;
    while (this.scn.hasNextInt()) {
      sum += this.scn.nextInt();
    }
    System.err.println("Summation :" + sum);
  }

  public static void main(String[] args) {
    IoScanner scanner = new IoScanner();

    // scanner.readVariousTypes();
    scanner.sumInput();
  }

}
