import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int n, m;
    static int[][] map;
    static boolean[][] visited;
    static int[] Xx = {-1, 1, 0, 0};
    static int[] Yy = {0, 0, -1, 1};


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt(); // n,m 받아오기
        sc.nextLine();

        visited = new boolean[n][m]; // 방문 여부
        map = new int[n][m]; // 맵 크기

        // 공백을 기준으로 숫자를 나누지만 공백 없이 받아와서 문자->숫자로
        for (int i = 0; i < n; i++) {
                String  line = sc.nextLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }
        bfs();
        System.out.println(map[n - 1][m - 1]);
    }
    private static void bfs() {
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{0,0});
        visited[0][0] = true;

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0]; // 행
            int y = current[1]; // 열

            for (int i = 0; i < 4; i++) {
                int nowX = x + Xx[i];
                int nowY = y + Yy[i];

              if (nowX >= 0 && nowY >= 0 && nowX < n && nowY < m
                  && map[nowX][nowY] != 0 && !visited[nowX][nowY]) {

                    visited[nowX][nowY] = true;
                    map[nowX][nowY] = map[x][y] + 1;
                    queue.offer(new int[]{nowX, nowY});
                }
            }

        }
        
    }
            
}



