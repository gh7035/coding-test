import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int z=0;z<T;z++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = 1;
            
           for(int i=0; i<b;i++) {
               result = (result*a) % 10;
           }
           if(result == 0) result = 10;
           System.out.println(result);

           
        }
    }
}