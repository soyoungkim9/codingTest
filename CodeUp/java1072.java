import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java1072 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String n = br.readLine();
    String[] nList = br.readLine().split(" ");

    for(String i : nList) {
      System.out.println(i);
    }
  }
}