public class IoCmdArgs {
  public static void main(String[] args) {
    if(args.length > 0) {
      System.err.println("Cmd arguments are: ");
      for (String val : args) System.out.println(val);
    } else {
      System.out.println("No cmd arguments found");
    }
  }
}
