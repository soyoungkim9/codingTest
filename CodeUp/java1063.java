import java.util.Scanner;

public class java1063 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    int y = input.nextInt();

    System.out.print(x > y ? x : y);
  }
}