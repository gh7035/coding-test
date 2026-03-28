import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] height = new int[9];
        int add = 0;
        for(int i=0;i<9;i++) {
            height[i] = sc.nextInt();
        }

        for(int i=0;i<9;i++) {
            add+=height[i];
        }

        int z=0;int x = 0;
        for(int a=0;a<9;a++) {
            for(int b=0;b<9;b++) {
                if(add-(height[a])-(height[b]) == 100) {
                    z = a;
                    x = b;
                    break;
                }
            }
        }
        height[z] = 0 ;
        height[x] = 0 ;

        Arrays.sort(height);
        for(int i=0;i<9;i++) {
            if(height[i]==0) {
                continue;
            }
            System.out.println(height[i]);
        }
    }
}