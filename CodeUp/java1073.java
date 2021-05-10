import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java1073 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    String[] arr = input.split(" ");

    int i = 0;
    while(Integer.parseInt(arr[i]) != 0) {
      System.out.println(arr[i]);
      i++;
    }
  }
}