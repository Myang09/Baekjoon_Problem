import java.util.*;

public class Main {
    static int[][] map; // 배추 위치
    static boolean[][] visited; // 방문 체크
    static int N; // 세로길이
    static int M; // 가로길이
    static int K; // 배추 개수
    
    
    // 상하좌우
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // 테스트 케이스
        
        // 테이스 케이스 수만큼 돌리자
        for(int t = 0; t < T; t++) {   
            M = sc.nextInt();
            N = sc.nextInt();
            K = sc.nextInt();
            
            map = new int[N][M]; 
            visited = new boolean[N][M];
            
            // 배추 위치 입력
            for(int i=0; i<K; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                map[y][x] = 1;
            }
            
            int count = 0;
            
            // 전체 탐색
            for(int i=0; i<N; i++) {
                for(int j=0; j<M; j++) {
                    
                    // 
                    if(map[i][j] == 1 && visited[i][j] == false) {
                        dfs(i, j);
                        count++;
                    }
                }
            }
            
            System.out.println(count);
        }
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;
        
        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            // 범위 안에 있고
            if(nx >= 0 && ny >= 0 && nx < N && ny < M) {
                
                // 배추 있고 아직 안 갔으면
                if(map[nx][ny] == 1 && visited[nx][ny] == false) {
                    dfs(nx, ny);
                }
            }
        }
    }
}