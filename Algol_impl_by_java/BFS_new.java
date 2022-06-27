package Algol_impl_by_java;
import java.util.*;
/*
참고:
https://komas.tistory.com/38

이 코드는 좀더 문제 풀이에서 사용할 수 있는 수준으로 풀이되어있다.

좀더 일반적인 방식으로 풀이되어있다.
 */


public class BFS_new {
    static int[][] graph = {{}, {2, 3, 8}, {1, 6, 8}, {1, 5}, {5, 7}, {3, 4, 7}, {2}, {4, 5}, {1, 2}};
    static boolean[] visited = new boolean[graph.length];
    static Queue<Integer> q = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        System.out.print("방문순서: ");
        BFS(1);
        System.out.println(sb);
    }

    public static void BFS(int n){
        q.offer(n);
        visited[n] = true;

        while (!q.isEmpty()) {
            int x = q.poll();
            sb.append(x).append(" ");

            for (int y : graph[x]) {
                if (!visited[y]) {
                    q.offer(y);
                    visited[y] = true;
                }
            }
        }
    }
}


