import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int brokenStr = sc.nextInt();
        int result = 0;
        int minPack = 1001;
        int minOne = 1001;
        int T = sc.nextInt();

        for(int i = 0; i < T; i++) {
            int p = sc.nextInt();
            int s = sc.nextInt();
            minPack = Math.min(minPack, p);
            minOne = Math.min(minOne, s);
        }

            int a = (brokenStr/6 +1) * minPack;
            int b = brokenStr * minOne;
            int c = (brokenStr / 6) * minPack + (brokenStr % 6) * minOne;

            result = Math.min(Math.min(a, b), c);

        System.out.println(result);

    }
}
