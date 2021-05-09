import java.util.Scanner;

public class java1064 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    int y = input.nextInt();
    int z = input.nextInt();

    System.out.print((x < y ? x : y) < z ? (x < y ? x : y) : z);
  }
}