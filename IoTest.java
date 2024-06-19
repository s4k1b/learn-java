import java.io.*;

public class IoTest {
  public static void main(String[] args) throws IOException {
    // InputStreamReader converts bytes to stream of characters
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(isr);
    String str = reader.readLine();
    System.out.println("Entered String: " + str);
    int n = Integer.parseInt(reader.readLine());
    System.out.println("Entered number: " + n);
  }
}
