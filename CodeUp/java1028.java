import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java1028 {
  public static void main(String[] args) throws IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    String longType = input.readLine();

    System.out.print(Long.parseLong(longType));
  }
}