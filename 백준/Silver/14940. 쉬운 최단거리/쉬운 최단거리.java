

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
    static int[][] dist;
    static int startX;
    static int startY;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt(); // n,m 받아오기
        visited = new boolean[n][m]; // 방문 여부
        map = new int[n][m]; // 맵 크기
        dist = new int[n][m];

        // 사작 좌표
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();

                if (map[i][j] == 2) {
                    startX = i;
                    startY = j;
                }
                // 갈 수 있는 땅은 일단 -1로 초기화
                if (map[i][j] == 1) {
                    dist[i][j] = -1;
                }
            }
        }
        bfs();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }
    }
        private static void bfs() {
            Queue<int[]> queue = new LinkedList<>();

            queue.offer(new int[]{startX, startY});
            visited[startX][startY] = true;
            dist[startX][startY] = 0;

            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                int x = current[0];
                int y = current[1];

                for (int i = 0; i < 4; i++) {
                    int nowX = x + Xx[i];
                    int nowY = y + Yy[i];

                    if (nowX >= 0 && nowY >= 0 && nowX < n && nowY < m) {
                        if (!visited[nowX][nowY] && map[nowX][nowY] != 0) {
                            visited[nowX][nowY] = true;
                            dist[nowX][nowY] = dist[x][y] + 1;
                            queue.offer(new int[]{nowX, nowY});
                        }
                    }

                }
            }
        }
 }