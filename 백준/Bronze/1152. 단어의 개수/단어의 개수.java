import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문장의 맨앞, 뒤 공백 제거
        String input = sc.nextLine().trim();  // 한 줄 입력 + 앞뒤 공백 제거

        if (input.isEmpty()) {
            System.out.println(0);
        } else {
            // 공백을 기준으로 단어를 쪼개서 배열에 넢음 split
            System.out.println(input.split(" ").length);
        }

        sc.close();
    }
}