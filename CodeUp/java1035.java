import java.util.Scanner;

public class java1035 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String x = input.next();
    int inputRedix = Integer.parseInt(x, 16);

    System.out.print(Integer.toOctalString(inputRedix));
  }
}