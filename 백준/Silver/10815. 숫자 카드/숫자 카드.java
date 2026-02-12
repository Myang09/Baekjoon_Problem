import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 상근이 카드 개수
        int n = sc.nextInt();
       Set<Integer> set = new HashSet<>();

        // 상근이 카드 입력
        for (int i = 0; i < n; i++) {
           set.add(sc.nextInt());
        }

        // 임의의 수
        int m = sc.nextInt();

        // 확인할 숫자들
        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            // 포함 여부 확인
            if(set.contains(num)) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }

        }
    }
}


