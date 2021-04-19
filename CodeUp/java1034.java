import java.util.Scanner;

public class java1034 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String x = input.nextLine();

    System.out.print(Integer.valueOf(x, 8));
  }
}