import java.util.Scanner;

public class java1025 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String num = scan.next();

    for(int i = 0; i < num.length(); i++) {
      int c = (int)Math.pow(10, num.length() - 1 - i);
      // int타입 보다 작은 타입(byte, short, char)의 이항연산자 일 경우 피연산자들이 int로 변환된다.
      // 아래와 같이 문자(char)가 int로 변환 될 경우 아스키코드값으로 바뀌게 된다.
      // ex) '7' - '0' 은 아스키코드 규칙에 의해 55 - 48 이다.
      System.out.println("[" + (num.charAt(i) - '0') * c + "]");
    }
  }
}