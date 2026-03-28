import java.io.*;
import java.util.*;
/*push X: 정수 X를 큐에 넣는 연산이다.
pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 큐에 들어있는 정수의 개수를 출력한다.
empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.*/
public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        Deque<Integer> deQueue = new LinkedList<>();


        for(int i=0;i<T;i++){
            String[] str = br.readLine().split(" ");

            switch(str[0]) {
                case "push":
                    deQueue.add(Integer.valueOf(str[1]));
                    break;
                case "pop":
                    if (deQueue.isEmpty()) bw.write(-1 + "\n");
                    else {
                        bw.write(deQueue.pollFirst() + "\n");
                    }
                    break;

                case "size":
                    if(deQueue.isEmpty()) bw.write(0 + "\n");
                    else bw.write(deQueue.size() + "\n");
                    break;

                case "empty":
                    if(deQueue.isEmpty()) bw.write(1 + "\n"); //비어있으면 1
                    else bw.write(0 + "\n"); //안 비어있으면 0

                    break;

                case "front":
                    if(deQueue.isEmpty()) bw.write(-1 + "\n");
                    else {
                        bw.write(deQueue.getFirst() + "\n");
                    }
                    break;
                case "back":
                    if(deQueue.isEmpty()) bw.write(-1 + "\n");
                    else {
                        bw.write(deQueue.getLast() + "\n");
                    }
                    break;
            }
        }
        bw.close();
    }
}