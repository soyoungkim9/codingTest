import java.util.Scanner;
import java.util.StringTokenizer;

public class java1019 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String date = sc.nextLine();

    StringTokenizer st = new StringTokenizer(date, ".");
    String[] arr = new String[3];
    for(int i = 0; i < 3; i++) {
      arr[i] = st.nextToken();
    }

    System.out.printf("%04d.%02d.%02d", Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
  }
}
