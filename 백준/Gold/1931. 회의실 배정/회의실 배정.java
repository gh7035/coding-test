import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int cnt=0;
        int[][] meet = new int[T][2];
        for(int i=0;i<T;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            meet[i][0] = a;
            meet[i][1] = b;
        }
        Arrays.sort(meet, new Comparator<int[]>(){

            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]) return o1[0]-o2[0];
                return o1[1]-o2[1];
            }
        });

        int end = 0;
        for(int[] row : meet) {
            if (end<=row[0]){
                cnt++;
                end = row[1];
            }
        }
        System.out.println(cnt);      



    }
}