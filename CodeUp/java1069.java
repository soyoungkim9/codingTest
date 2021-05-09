import java.util.Scanner;

public class java1069 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    switch (input.next()) {
      case "A":
        System.out.print("best!!!");
        break;
      case "B":
        System.out.print("good!!");
        break;
      case "C":
        System.out.print("run!");
        break;
      case "D":
        System.out.print("slowly~");
        break;
      default:
        System.out.print("what?");
        break;
    }
  }
}