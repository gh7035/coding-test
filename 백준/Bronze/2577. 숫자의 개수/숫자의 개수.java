import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = (sc.nextInt() * sc.nextInt() * sc.nextInt());
        
        String arr = String.valueOf(sum);
        
        int[] count = new int[10];
        for (int i = 0; i < arr.length(); i++) {
            int manyNum = arr.charAt(i) - '0';
            count[manyNum]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }

        }
    }