import java.util.Scanner;

public class java1049 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    int result;
    if (a > b) {
      result = 1;
    } else {
      result = 0;
    }

    System.out.print(result);
  }
}