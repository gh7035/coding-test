import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        String A1 = String.valueOf(A);
        String B1 = String.valueOf(B);
        
        String reverseA = new StringBuilder(A1).reverse().toString();
        String reverseB = new StringBuilder(B1).reverse().toString();
        
        int reverseNumA = Integer.parseInt(reverseA);
        int reverseNumB = Integer.parseInt(reverseB);
        
        if(reverseNumA < reverseNumB) System.out.println(reverseNumB);
            else System.out.println(reverseNumA);
    }
}