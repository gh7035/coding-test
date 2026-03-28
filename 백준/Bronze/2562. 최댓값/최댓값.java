import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max=-1, index = -1;
        for(int a=0; a<9; a++){
            arr[a] = sc.nextInt();
            if(arr[a] > max) {
                max = arr[a];
                index = a;
            }
        }
            
        System.out.println(max);
        System.out.print(index+1);
    }
}