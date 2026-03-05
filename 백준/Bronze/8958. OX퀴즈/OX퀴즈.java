import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {

            String s = br.readLine();
            int score = 0;
            int count = 0;

            for(int j = 0; j < s.length(); j++) {

                if(s.charAt(j) == 'O') {
                    count++;        // 연속 O 증가
                    score += count; // 누적
                } else {
                    count = 0;      // X 나오면 초기화
                }

            }

            System.out.println(score);
        }
    }
}