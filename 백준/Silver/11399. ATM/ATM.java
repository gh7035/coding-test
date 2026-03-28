import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[T];
        for(int i=0;i<T;i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<T-1;i++) {
            arr[i+1] += arr[i];
        }
        
        int cnt = 0;
        for(int i=0;i<T;i++) {
            cnt += arr[i];
        }
        System.out.println(cnt);
        
    }
}