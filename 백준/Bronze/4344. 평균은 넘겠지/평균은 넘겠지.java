import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) { // 전체를 N만큼 반복
            int A = sc.nextInt();
            int[] arr = new int[A];
            int sum = 0;

            for (int j = 0; j < A; j++) {  //평균 구하기 위한 점수들의 합
                arr[j] = sc.nextInt();
                sum += arr[j];
            }

            double avg = (double) sum / A;

            int cnt = 0;
            for (int score : arr) { //평균을 넘는 학생수
                if (score > avg) cnt++;
            }

            double result = (double) cnt / A * 100;
            System.out.printf("%.3f%%\n", result);
        }
    }
}
