public class FlowControl {
  static void ifElseStatement(int n) {
    if (n < 10)
      System.out.println("Number is less than 10");
    else if (n == 10)
      System.out.println("Number is equal to 10");
    else
      System.out.println("Number is not less than 10");
  }

  static void switchStatement(int n) {
    switch (n) {
      case 1:
        System.out.println("The number is 1");
        break;
      case 2:
        System.err.println("The number is 2");
        break;
      default:
        System.err.println("Not present");
    }
  }

  static void breakAndContinue(int n) {
    for (int i = 0; i <= n; i++) {
      if ((i & 1) == 0) {
        continue;
      } else if (i == 5) {
        break;
      } else {
        System.out.println("Number is " + i);
      }
    }
  }

  static void forEachLoop() {
    String[] names = {"Sakib", "Rakib", "Masud"};
    for(String name : names) {
      System.out.println(name);
    }
  }

  public static void main(String[] args) {
    FlowControl.ifElseStatement(10);
    FlowControl.switchStatement(10);
    FlowControl.breakAndContinue(10);
    FlowControl.forEachLoop();
  }
}
