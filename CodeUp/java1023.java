import java.util.Scanner;
import java.util.StringTokenizer;

public class java1023 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String f = scan.next();
    StringTokenizer st = new StringTokenizer(f, ".");

    System.out.println(st.nextToken() + '\n' + st.nextToken());
  }
}