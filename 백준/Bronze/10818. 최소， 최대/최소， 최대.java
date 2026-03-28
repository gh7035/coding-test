import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0; i<a; i++) {
            arr[i] = sc.nextInt();
        }
        int lastindex = arr.length - 1;
        Arrays.sort(arr);
        System.out.print(arr[0]);
        System.out.print(" " + arr[lastindex]);
        
    }
}