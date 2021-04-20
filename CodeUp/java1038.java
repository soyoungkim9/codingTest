import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java1038 {
  public static void main(String[] args) throws IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    String x = input.readLine();
    String[] arr = x.split("\\s");

    System.out.print(Long.parseLong(arr[0]) + Long.parseLong(arr[1]));

  }
}