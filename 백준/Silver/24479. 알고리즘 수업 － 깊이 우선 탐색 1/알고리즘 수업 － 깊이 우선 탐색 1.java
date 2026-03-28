import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static int[] visited;
    static int order = 1;

    static void dfs(int now) {
        visited[now] = order++;

        for (int next : graph[now]) {
            if (visited[next] == 0) {
                dfs(next);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int element = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        graph = new ArrayList[element+1];
        visited = new int[element+1];

        for (int i = 1; i <= element; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        for (int i = 1; i <=element; i++) {
            Collections.sort(graph[i]);
        }

        dfs(start);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= element; i++) {
            sb.append(visited[i]).append("\n");
        }
        System.out.println(sb);


    }
}