import java.util.Scanner;

public class java1022 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String st = scan.nextLine();

    if(st.length() < 2001) {
      System.out.println(st);
    }
  }
}