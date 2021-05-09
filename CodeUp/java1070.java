import java.util.Scanner;

public class java1070 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    switch (input.nextInt()) {
      case 12:
      case 1:
      case 2:
        System.out.print("winter");
        break;
      case 3:
      case 4:
      case 5:
        System.out.print("spring");
        break;
      case 6:
      case 7:
      case 8:
        System.out.print("summer");
        break;
      case 9:
      case 10:
      case 11:
        System.out.print("fall");
        break;
    }
  }
}