import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<c; i++) {
            long a = sc.nextInt();
            long b = sc.nextInt();
            a = a+0;
            b = b+0;
            System.out.println(a+b);
        }
    }
}