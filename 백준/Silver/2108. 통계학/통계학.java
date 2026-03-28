import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        HashMap<Integer, Integer> map = new HashMap<>();
        double sum = 0;

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }

        System.out.println(Math.round(sum / N));

        Arrays.sort(a);
        System.out.println(a[N / 2]);

        int maxFreq = 0;
        for (int freq : map.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        ArrayList<Integer> modes = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) == maxFreq) {
                modes.add(key);
            }
        }

        Collections.sort(modes);

        if (modes.size() > 1) {
            System.out.println(modes.get(1));
        } else {
            System.out.println(modes.get(0));
        }

        System.out.println(a[N - 1] - a[0]);
    }
}
