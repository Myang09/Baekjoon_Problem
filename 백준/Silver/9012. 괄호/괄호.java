import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수
        
        for (int i = 0; i < T; i++) {
            int count = 0;
            boolean b = true;
            String arr = br.readLine();
            
            for (int j = 0; j < arr.length(); j++) {
                char c = arr.charAt(j);
                
                if (c == '(') {
                    count++;
                } else {
                    count--;
                }
                
                if (count < 0) {
                    b = false;
                    break;
                }
            }
            
            if (b && count == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}