import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int cnt = 0;
        for (int i = 0; i <= a.length() - 4; i++) {
            if (a.charAt(i) == 'D' &&
                a.charAt(i+1) == 'K' &&
                a.charAt(i+2) == 'S' &&
                a.charAt(i+3) == 'H') {
                cnt++;
            }
        }
        System.out.println(cnt);

}
}