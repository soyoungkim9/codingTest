import java.util.Scanner;

public class java1074 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    int i = n;
    while(i > 0) {
      System.out.println(i--);
    }
  }
}