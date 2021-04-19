import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java1029 {
  public static void main(String[] args) throws IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    String f = input.readLine();

    System.out.printf("%.11f", Double.parseDouble(f));
  }
}