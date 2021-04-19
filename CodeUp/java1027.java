import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java1027 {
  public static void main(String[] args) throws IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    String date = input.readLine();
    String[] arr = date.split("\\.");

    System.out.print(arr[2] + "-" + arr[1] + "-" + arr[0]);
  }
}