import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = new String();
        int i = 1;
        while(true){
            a = sc.nextLine();
            if(a.equals("0")){
                break;
            }
            
            System.out.printf("Case %d: Sorting... done!\n", i);
            i++;
        }
    }
}