import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java1030 {
  public static void main(String[] args) throws IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    String d = input.readLine();

    System.out.print(Long.parseLong(d));
  }
}