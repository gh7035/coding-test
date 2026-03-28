import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cntA=0;
        int cntB=0;
        String a = sc.nextLine();
        String b = sc.nextLine();
        for(int i=0; i<a.length(); i++) {
            if(a.charAt(i) == 'h'){
                break;
            }
            cntA++;
        }
        for(int i=0; i<b.length(); i++) {
            if(b.charAt(i) == 'h'){
                break;
            }
            cntB++;
        }
        if(cntA < cntB) {
            System.out.printf("no");
        }
        else if(cntA >= cntB){
            System.out.printf("go");
        }
    }
}