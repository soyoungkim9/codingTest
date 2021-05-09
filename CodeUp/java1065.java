import java.util.Scanner;

public class java1065 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    int y = input.nextInt();
    int z = input.nextInt();

    if(x%2 == 0) System.out.println(x);
    if(y%2 == 0) System.out.println(y);
    if(z%2 == 0) System.out.println(z);
  }
}