import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java1079 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    String[] arr = input.split(" ");

    for(int i = 0; i < arr.length; i++) {
      if(arr[i].equals("q")) {
        System.out.println(arr[i]);
        break;
      }
      System.out.println(arr[i]);
    }
  }
}