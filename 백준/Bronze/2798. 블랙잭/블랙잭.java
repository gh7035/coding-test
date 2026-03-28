import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int max =sc.nextInt();

        int result = 0;

        int[] cards = new int[T];
        for(int t=0;t<T;t++) cards[t]=sc.nextInt();

        for(int i=0;i<T-2;i++){
            for(int j=i+1;j<T-1;j++){
                for(int k=j+1;k<T;k++){
                    int sum = cards[i]+cards[j]+cards[k];
                    if(sum<=max && sum > result) result=sum;
                }
            }
        }
        System.out.println(result);

    }
}