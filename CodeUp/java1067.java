import java.util.Scanner;

public class java1067 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();

    if (x > 0) System.out.println("plus");
    else System.out.println("minus");

    if (x%2 == 0) System.out.println("even");
    else System.out.println("odd");
  }
}