import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 맨 처음 제공 되는 단어 수
        int N = sc.nextInt();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            // 단어 입력
            String word = sc.next();          // 이름 입력
            // set에 추가
            set.add(word);
        }

        // 배열에 추가
        List<String> list = new ArrayList<>(set);

        Collections.sort(list, new Comparator<String>() {
            // compare = 인터페이스 / 추상 메소드 안에 재정의
            @Override
            public int compare(String a, String b) {
                // 길이 다르면 길이 기준 정렬
                if (a.length() != b.length()) {
                    return a.length() - b.length();
                }
                // 길이 같으면 사전순
                return a.compareTo(b);
            }
        });

        // 리스트의 사이즈(저장된 단어 개수)만큼 출력
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        }
    }