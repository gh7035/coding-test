import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        Integer[] a = new Integer[T];
        Integer[] b = new Integer[T];
        for(int i=0;i<T;i++) a[i] = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<T;i++) b[i] = sc.nextInt();
        
        Arrays.sort(a);
        Arrays.sort(b);
        int result = 0;
        for(int i=0;i<T;i++) {
            result += a[T-i-1]*b[i];
        }
        System.out.println(result);
        
        
    }
}