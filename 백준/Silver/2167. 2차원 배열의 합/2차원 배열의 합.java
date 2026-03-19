import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N= 행 개수
        int N = sc.nextInt();
        // 열의 개수
        int M = sc.nextInt();
        // 2차원 배열
        int[][] arr = new int[N][M];

        // 입력된 숫자를 배열에 넣쟈
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int K = sc.nextInt();

        // K개의 구간 합 구하기
        for (int t = 0; t < K; t++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int sum = 0;
            // 입력은 1부터 시작하니까 -1 해서 배열 맞추자
            for (int row = i - 1; row <= x - 1; row++) {
                for (int col = j - 1; col <= y - 1; col++) {
                    sum += arr[row][col];
                }
            }

            System.out.println(sum);
        }

        sc.close();
    }
}