import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] arr = sc.nextLine().toCharArray();
        int sec = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 'A' || arr[i] == 'B' || arr[i] == 'C') sec += 3;
            else if(arr[i] == 'D' || arr[i] == 'E' || arr[i] == 'F') sec += 4;
            else if(arr[i] == 'G' || arr[i] == 'H' || arr[i] == 'I') sec += 5;
            else if(arr[i] == 'J' || arr[i] == 'K' || arr[i] == 'L') sec += 6;
            else if(arr[i] == 'M' || arr[i] == 'N' || arr[i] == 'O') sec += 7;
            else if(arr[i] == 'P' || arr[i] == 'Q' || arr[i] == 'R' || arr[i] == 'S') sec += 8;
            else if(arr[i] == 'T' || arr[i] == 'U' || arr[i] == 'V') sec += 9;
            else if(arr[i] == 'W' || arr[i] == 'X' || arr[i] == 'Y' || arr[i] == 'Z') sec += 10;
        }
        System.out.println(sec);
    }
}
