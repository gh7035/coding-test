import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        char[] arr = sc.next().toCharArray();
        int a = 0;
        for(char b : arr) {
            a += b-'0';
        }
        System.out.println(a);
        
        
    }
}