import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(100*a < b) {
            System.out.printf("No");
            
        }
        else {
            System.out.printf("Yes");
        }
    }
}