import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            sc.nextLine();
        
            for(int i=0; i<N; i++) { //총 N번 반복
                String ox = sc.nextLine();
                int score = 0, combo = 0;
                
                for (int j=0; j<ox.length(); j++) {
                    if(ox.charAt(j) == 'O') {
                        combo++;
                        score += combo;
                    }
                    else if(ox.charAt(j) == 'X') {
                        combo = 0;
                    }
                }
                
                System.out.println(score);
                
                
                
            }

        }
    }