import java.util.Scanner;

public class java1082 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int x = input.nextInt(16);

    for(int i = 1; i < 16; i++) {
      System.out.printf("%X*%X=%X\n",x,i,x*i);
    }
  }
}