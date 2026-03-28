import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int add = 0;

            for (int i = N; i <= M; i++) {
                String a = Integer.toString(i);

                for(int j = 0; j < a.length(); j++) {
                    if (a.charAt(j) == '0') {
                        add++;
                    }
                }
            }
            System.out.println(add);
        }
    }
}
