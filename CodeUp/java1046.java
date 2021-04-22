import java.util.Scanner;

public class java1046 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();

    System.out.println(a+b+c);
    System.out.printf("%.1f", (float)(a+b+c)/3);
  }
}