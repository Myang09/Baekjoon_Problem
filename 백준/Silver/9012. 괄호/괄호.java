import java.util.*;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++) {
        	int count = 0;
            boolean b = true;
            String arr = sc.next();
            for(int j=0; j<arr.length(); j++) {
              char c = arr.charAt(j);
              if(c == '(') {
                  count++;
              } else {
                  count--;
              }
              if(count < 0) {
                  b = false;
                  break;
              }
          	}
        	if(b && count == 0) {
        		System.out.println("YES");
        	} else {
        		System.out.println("NO");
        	}
    	}
    	sc.close();
	}
}