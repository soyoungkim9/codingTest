import java.util.Scanner;

public class java1075 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    while(n > 0) {
      System.out.println(--n);
    }
  }
}