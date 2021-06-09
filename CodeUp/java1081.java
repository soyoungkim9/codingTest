import java.util.Scanner;

public class java1081 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();

    for(int i = 1; i <= a; i++) {
      for(int j = 1; j <= b; j++) {
        System.out.println(i + " " + j);
      }
    }
  }
}