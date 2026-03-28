import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = new String();

        while(true){
            a = sc.nextLine();
            int cnt = 0;
            if(a.equals("#")){
                break;
            }
            a = a.toLowerCase();
        for(int i=0; i<a.length(); i++) {
            char ch = a.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                cnt++;
            }
        }
        System.out.println(cnt);
        }
    }
}