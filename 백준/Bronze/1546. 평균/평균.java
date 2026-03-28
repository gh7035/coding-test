import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        double max = 0;
        double hap = 0;
        int N = sc.nextInt();
        double[] arr = new double[N];
        for(int i=0; i<N; i++) { // 값 받기
            arr[i] = sc.nextDouble();
        }
        for(int i=0; i<N; i++) {
            if(arr[i] > max) max = arr[i];
        }
        for(int i=0; i<N; i++) { // 값 조작하기
            hap += (arr[i] / max)*100;
        }
        System.out.println(hap / N);
        
    }
}