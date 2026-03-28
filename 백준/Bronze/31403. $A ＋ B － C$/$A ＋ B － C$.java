import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int a = A + B - C;

        String b = Integer.toString(A) + Integer.toString(B);

        int c = Integer.parseInt(b) - C;

        System.out.println(a);
        System.out.println(c); 
    }
}