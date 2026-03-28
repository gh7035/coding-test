import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[8];
        for(int i=0 ;i<8; i++) {
            a[i] = sc.nextInt();
            
        }
        char result='S';
        for(int q : a) {
            if (q == 9) {
                result = 'F';
            }
        }
        System.out.println(result);
    }
}