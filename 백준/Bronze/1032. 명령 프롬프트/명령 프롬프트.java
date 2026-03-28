import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String[] str = new String[a];

        StringBuilder result = new StringBuilder();

        for(int i=0; i<a; i++) { // 받기
            str[i] = sc.nextLine();
        }

        int len = str[0].length();

        for(int i=0; i<len; i++) { // 문자열 같은지 보기
            char c = str[0].charAt(i);
            boolean isTrue = true;

            for(int j=1; j<a; j++) {
                if(c != str[j].charAt(i)) {
                    isTrue = false;
                    break;
                }
            }

            if (isTrue) result.append(c);
            else result.append("?");
        }
        System.out.println(result);
    }
}