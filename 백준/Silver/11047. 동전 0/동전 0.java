import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int money = sc.nextInt();
        int[] numbs = new int[T];
        Integer a;
        int cnt = 0;
        int j = 1;
        int len = numbs.length;
        for(int i=0;i<T;i++) {
            a = sc.nextInt();
            numbs[i] = a;
        }
        
        while(money > 0) {
            int now = numbs[len-j];
            if(now <= money){
                cnt += money / now;
                money %= now;
            }
            else {
                j++;
            }
            
        }
        System.out.println(cnt);
    }
}