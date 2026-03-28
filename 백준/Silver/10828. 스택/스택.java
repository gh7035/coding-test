import java.util.*;
/*push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        List<Integer> stack = new ArrayList<Integer>();


        for(int i=0;i<T;i++){
            String str = sc.next();

            switch(str) {
                case "push":
                int x = sc.nextInt();
                stack.add(x);
                    break;
                case "pop":
                    if (stack.isEmpty()) System.out.println(-1);
                    else {
                        int lastIndex = stack.size()-1;
                        System.out.println(stack.get(lastIndex));
                        stack.remove(lastIndex);
                    }
                    break;

                case "size":
                    if(stack.isEmpty()) System.out.println(0);
                    else System.out.println(stack.size());
                    break;

                case "empty":
                    if(stack.isEmpty()) System.out.println(1); //비어있으면 1
                    else System.out.println(0); //안 비어있으면 0

                    break;

                case "top":
                    if(stack.isEmpty()) System.out.println(-1);
                    else {
                        int llastIndex = stack.size()-1;
                        System.out.println(stack.get(llastIndex));
                    }
                    break;
            }
        }
    }
}