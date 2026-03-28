import java.util.*;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<T;i++) {
            String a = sc.nextLine();
            int len = a.length();
            if(len > 5 && len < 10) {
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        } 
        
    }
}