import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rr = sc.nextLine();
        for (int i = 0; i < rr.length(); i++) {
            char a = rr.charAt(i);
            if (Character.isUpperCase(a)) {
                System.out.print(Character.toLowerCase(a));
            } else {
                System.out.print(Character.toUpperCase(a));
            }
        }
    }
}
