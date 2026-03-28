import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        StringBuffer sb = new StringBuffer(a);
        String revA = sb.reverse().toString();
        if(a.equals(revA)) System.out.println(1);
        else System.out.println(0);
    }
}