import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java1026 {
  public static void main(String[] args) throws IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    String time = input.readLine();
    String[] token = time.split(":", 3);

    System.out.println(Integer.parseInt(token[1]));
    /*
    1. Scanner
     - 사용하기 편리하지만 속도가 느리다.
     - 공란과 줄바꿈을 모두 입력값의 경계로 인식한다.
     - 데이터 타입이 입력 받는 시점에서 결정된다. 그래서 별도의 Casting이 필요하지 않다.
    2. BufferReader (코딩테스트 사용용도로 적합)
     - 선언할 것이 많아 번거롭지만 비교적 속도가 빠르다.
     - 한줄을 통째로 입력받는 방식
     - 입력을 라인단위로 입력 받기 때문에 공백의 경우에도 String으로 인식하여 받아들인다. 그래서 별도의 Casting이 필요하다.
     */
  }
}