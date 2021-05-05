import java.util.Scanner;

public class java1051 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    if(b >= a) System.out.print(1);
    else System.out.print(0);
  }
}