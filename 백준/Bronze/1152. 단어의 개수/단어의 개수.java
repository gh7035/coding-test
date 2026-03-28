import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String get = sc.nextLine().trim();
        if (get.isEmpty()) System.out.println(0);
        else{
            String[] words = get.split(" ");
            System.out.println(words.length);
        }
    }
}