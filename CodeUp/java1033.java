import java.util.Scanner;

public class java1033 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();

    System.out.print(Integer.toHexString(x).toUpperCase());
  }
}