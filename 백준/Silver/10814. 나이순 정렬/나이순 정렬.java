import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 맨 처음 제공 되는 나이 수
        int N = sc.nextInt();                 
        List<String[]> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {         
            int age = sc.nextInt();           // 나이 입력
            String name = sc.next();          // 이름 입력
            // 숫자를 문자열로 바꿔서 추가 
            list.add(new String[]{String.valueOf(age), name}); 
        }

       // 정렬 람다식 
        Collections.sort(list, (a, b) ->
            // 나이 비교하여 오름차순으로 오도록
            Integer.parseInt(a[0]) - Integer.parseInt(b[0])
        );

        // list 안에 있는 배열을 하나씩 꺼내서 출력 
        // m[0] = age, m[1] = name 남겨서 출력
       for (int i = 0; i < list.size(); i++) {
            String[] m = list.get(i);
            System.out.println(m[0] + " " + m[1]);
        }
    }
}