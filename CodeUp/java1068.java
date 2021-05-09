import java.util.Scanner;

public class java1068 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();

    if (x >= 90) {
      System.out.print("A");
    } else if (x >= 70) {
      System.out.print("B");
    } else if (x >= 40) {
      System.out.print("C");
    } else {
      System.out.print("D");
    }
  }
}