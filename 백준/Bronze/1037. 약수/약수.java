import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i <T;i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);
        int result = 0;
        result = list.get(0) * list.get(T-1);
        System.out.println(result);

    }
}