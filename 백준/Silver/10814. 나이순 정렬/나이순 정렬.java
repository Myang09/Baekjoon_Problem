import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();                 
        List<String[]> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {         
            int age = sc.nextInt();           // 나이 입력
            String name = sc.next();          // 이름 입력
            list.add(new String[]{String.valueOf(age), name});  // 저장
        }

       
        Collections.sort(list, (a, b) ->
            Integer.parseInt(a[0]) - Integer.parseInt(b[0])
        );

        
        for (String[] m : list) {
            System.out.println(m[0] + " " + m[1]);
        }
    }
}