import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 0;
        sc.nextLine();
        String b = new String();
        for(int i=0; i<a; i++) {
            b = sc.nextLine();
            if (b.contains("01") || b.contains("OI")) {
                    cnt++;
                }
        }
        System.out.println(cnt);
    }
}