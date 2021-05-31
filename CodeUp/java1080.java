import java.util.Scanner;

public class java1080 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    int total = 0;
    int i = 0;

    while(total < num) {
      total += ++i;
    }

    System.out.print(i);
  }
}