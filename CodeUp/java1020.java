import java.util.Scanner;
import java.util.StringTokenizer;

public class java1020 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String rnum = scan.nextLine();
    // split 메소드는 regex(정규표현식)을 사용하기 때문에 속도즉인 측면에서는 StringTokenizer가 좋다.
    // 하지만 가변적인 요소가 많거나 정확한 분리가 필요할 때에는 split 메서드를 사용하는 것이 좋다.
    StringTokenizer token = new StringTokenizer(rnum, "-");
    String st1 = token.nextToken();
    String st2 = token.nextToken();

    if(st1.length() == 6 && st2.length() == 7) {
      System.out.println(st1 + st2);
    }
  }
}