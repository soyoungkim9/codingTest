import java.util.Scanner;

public class java1059 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();

    System.out.print(~x);
    // 2의 보수는 1의 보수를 취한 형태에서 1을 더한다.
    // ex1) -2 -> -2 + 1 = 1
    // ex2) 2 -> 2 + 1 = -3
  }
}