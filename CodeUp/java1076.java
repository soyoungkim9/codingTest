import java.util.Scanner;

public class java1076 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char ch = input.next().charAt(0);

    char i = 'a';
    while(i <= ch) {
      System.out.print(i++ + " ");
    }
  }
}