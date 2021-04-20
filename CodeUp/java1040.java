import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java1040 {
  public static void main(String[] args) throws IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    String x = input.readLine();

    System.out.print(-(Integer.parseInt(x)));
  }
}