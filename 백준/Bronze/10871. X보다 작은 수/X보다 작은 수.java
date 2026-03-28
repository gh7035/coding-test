import java.util.*;
public class Main{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 몇개 받을건지
        int x = sc.nextInt(); // 무슨 숫자로 비교한건지
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] < x) System.out.printf("%d ",arr[i]); 
        }
    }
}