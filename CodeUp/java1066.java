import java.util.Scanner;

public class java1066 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    int y = input.nextInt();
    int z = input.nextInt();

    if (x%2 == 0) System.out.println("even");
    else System.out.println("odd");

    if (y%2 == 0) System.out.println("even");
    else System.out.println("odd");

    if (z%2 == 0) System.out.println("even");
    else System.out.println("odd");
  }
}