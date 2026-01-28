import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0); // 문자 하나 입력
        System.out.println((int) ch);  // 아스키 코드 출력
    }
}
